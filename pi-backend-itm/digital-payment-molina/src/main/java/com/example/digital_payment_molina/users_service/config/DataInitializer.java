package com.example.digital_payment_molina.users_service.config;

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
        // Crea un admin por defecto si no existe
        String adminEmail = "admin@local";
        if (userRepository.findByEmail(adminEmail).isEmpty()) {
            User admin = new User();
            admin.setNyap("Administrador General");
            admin.setDni("00000000");
            admin.setEmail(adminEmail);
            admin.setTelefono("0000000000");
            admin.setPassword(passwordEncoder.encode("admin123")); // Cambiar en prod
            admin.setCvu("ADMINCVU000000000000");
            admin.setAlias("admin");

            // Asignar rol ADMIN
            roleRepository.findByName("ADMIN").ifPresent(r -> admin.getRoles().add(r));

            userRepository.save(admin);
            System.out.println("✅ Usuario ADMIN creado: " + adminEmail + " / admin123");
        }
    }
}
