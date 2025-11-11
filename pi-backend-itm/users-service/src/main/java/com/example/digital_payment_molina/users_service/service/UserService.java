package com.example.digital_payment_molina.users_service.service;

import com.example.digital_payment_molina.users_service.dto.AccountDTO;
import com.example.digital_payment_molina.users_service.dto.UserDTO;
import com.example.digital_payment_molina.users_service.exceptions.ContrasenaIncorrectaException;
import com.example.digital_payment_molina.users_service.exceptions.UsuarioNoEncontradoException;
import com.example.digital_payment_molina.users_service.feign.AccountsClient;
import com.example.digital_payment_molina.users_service.feign.AuthClient;
import com.example.digital_payment_molina.users_service.model.AuthRequest;
import com.example.digital_payment_molina.users_service.model.AuthResponse;
import com.example.digital_payment_molina.users_service.model.Role;
import com.example.digital_payment_molina.users_service.model.User;
import com.example.digital_payment_molina.users_service.repository.RoleRepository;
import com.example.digital_payment_molina.users_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final AccountsClient accountsClient;
    private final AuthClient authClient;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    public UserService(UserRepository userRepository,
                       RoleRepository roleRepository,
                       AccountsClient accountsClient,
                       AuthClient authClient) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.accountsClient = accountsClient;
        this.authClient = authClient;
    }

    public UserDTO registerUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email ya registrado");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        Role userRole = roleRepository.findByName("USER")
                .orElseThrow(() -> new RuntimeException("Rol USER no encontrado. Asegúrate de inicializar los roles."));
        user.getRoles().add(userRole);

        User saved = userRepository.save(user);

        // Crear cuenta en accounts-service
        AccountDTO account = AccountDTO.builder()
                .userId(saved.getId())
                .saldoDisponible(0.0)
                .build();

        try {
            accountsClient.createAccount(account);
            System.out.println("✅ Cuenta creada para el usuario: " + saved.getEmail());
        } catch (Exception e) {
            System.err.println("⚠️ Error al crear cuenta: " + e.getMessage());
        }

        return new UserDTO(
                saved.getId(),
                saved.getNyap(),
                saved.getDni(),
                saved.getEmail(),
                saved.getTelefono()
        );
    }

    public AuthResponse userLogin(String email, String rawPassword) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsuarioNoEncontradoException("Usuario (email) inexistente"));

        if (!passwordEncoder.matches(rawPassword, user.getPassword())) {
            throw new ContrasenaIncorrectaException("Email o contraseña incorrectos");
        }

        // ✅ Delegar autenticación al Auth-Service
        AuthRequest request = new AuthRequest(email, rawPassword);
        return authClient.login(request);
    }

    public void logout(String token) {
        try {
            authClient.logout(token);
        } catch (Exception e) {
            throw new RuntimeException("Error al cerrar sesión: " + e.getMessage());
        }
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
