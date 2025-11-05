package com.example.digital_payment_molina.users_service.config;

import com.example.digital_payment_molina.users_service.dto.AccountDTO;
import com.example.digital_payment_molina.users_service.feign.AccountsClient;
import com.example.digital_payment_molina.users_service.model.Role;
import com.example.digital_payment_molina.users_service.model.User;
import com.example.digital_payment_molina.users_service.repository.RoleRepository;
import com.example.digital_payment_molina.users_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    private final AccountsClient accountsClient;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public void run(String... args) {
        initializeRoles();
        initializeAdminUser();
    }

    private void initializeRoles() {
        createRoleIfNotExists("ADMIN");
        createRoleIfNotExists("USER");
    }

    private void createRoleIfNotExists(String roleName) {
        if (roleRepository.findByName(roleName).isEmpty()) {
            Role role = new Role();
            role.setName(roleName);
            roleRepository.save(role);
            System.out.println("✅ Rol creado: " + roleName);
        }
    }

    private void initializeAdminUser() {
        String adminEmail = "admin@local";

        if (userRepository.findByEmail(adminEmail).isEmpty()) {
            // 🧩 Crear usuario admin
            User admin = new User();
            admin.setNyap("Administrador General");
            admin.setDni("00000000");
            admin.setEmail(adminEmail);
            admin.setTelefono("0000000000");
            admin.setPassword(passwordEncoder.encode("admin123"));

            // Rol ADMIN
            roleRepository.findByName("ADMIN").ifPresent(r -> admin.getRoles().add(r));

            // Guardar usuario en BD
            User savedAdmin = userRepository.save(admin);
            System.out.println("✅ Usuario ADMIN creado: " + adminEmail + " / admin123");

            // 🏦 Crear automáticamente su cuenta en accounts-service (con reintentos)
            createAdminAccountWithRetry(savedAdmin);
        }
    }

    // 🔁 Lógica de reintentos: espera a que accounts-service esté registrado en Eureka
    private void createAdminAccountWithRetry(User savedAdmin) {
        int retries = 10;    // número máximo de intentos
        int delayMs = 5000;  // espera entre intentos

        for (int i = 1; i <= retries; i++) {
            try {
                AccountDTO account = AccountDTO.builder()
                        .userId(savedAdmin.getId())
                        .saldoDisponible(0.0)
                        .build();

                accountsClient.createAccount(account);
                System.out.println("💳 Cuenta creada para ADMIN (userId=" + savedAdmin.getId() + ")");
                return;
            } catch (Exception e) {
                System.err.println("⚠️ Intento " + i + " de crear cuenta falló: " + e.getMessage());
                try {
                    Thread.sleep(delayMs);
                } catch (InterruptedException ignored) {}
            }
        }

        System.err.println("❌ No se pudo crear la cuenta del admin tras varios intentos.");
    }
}
