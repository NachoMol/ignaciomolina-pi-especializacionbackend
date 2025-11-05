package com.example.digital_payment_molina.users_service.service;

import com.example.digital_payment_molina.users_service.dto.AccountDTO;
import com.example.digital_payment_molina.users_service.dto.UserDTO;
import com.example.digital_payment_molina.users_service.exceptions.ContrasenaIncorrectaException;
import com.example.digital_payment_molina.users_service.exceptions.UsuarioNoEncontradoException;
import com.example.digital_payment_molina.users_service.feign.AccountsClient;
import com.example.digital_payment_molina.users_service.model.Role;
import com.example.digital_payment_molina.users_service.model.User;
import com.example.digital_payment_molina.users_service.repository.RoleRepository;
import com.example.digital_payment_molina.users_service.repository.TokenBlacklistRepository;
import com.example.digital_payment_molina.users_service.repository.UserRepository;
import com.example.digital_payment_molina.users_service.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private AccountsClient accountsClient;

    @Autowired
    JwtUtil jwtUtil;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    TokenBlacklistRepository tokenBlacklistRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO registerUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email ya registrado");
        }

        // Encriptar contraseña
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Asignar rol USER por defecto
        Role userRole = roleRepository.findByName("USER")
                .orElseThrow(() -> new RuntimeException("Rol USER no encontrado. Asegúrate de inicializar los roles."));
        user.getRoles().add(userRole);

        // Guardar usuario en la base de datos
        User saved = userRepository.save(user);

        // ✅ Crear cuenta automáticamente en accounts-service
        AccountDTO account = AccountDTO.builder()
                .userId(saved.getId())
                .saldoDisponible(0.0)
                .build();

        try {
            accountsClient.createAccount(account);
            System.out.println("✅ Cuenta creada en accounts-service para el usuario: " + saved.getEmail());
        } catch (Exception e) {
            System.err.println("⚠️ Error al crear cuenta en accounts-service: " + e.getMessage());
        }

        // Retornar respuesta final
        return new UserDTO(
                saved.getId(),
                saved.getNyap(),
                saved.getDni(),
                saved.getEmail(),
                saved.getTelefono()
        );
    }

    public String userLogin(String email, String rawPassword) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsuarioNoEncontradoException("Usuario (email) inexistente"));

        if (!passwordEncoder.matches(rawPassword, user.getPassword())) {
            throw new ContrasenaIncorrectaException("Email o contraseña incorrectos");
        }

        return jwtUtil.generateToken(email);
    }

    public void logout(String token) {
        if (token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        try {
            String email = jwtUtil.extractEmail(token);
            System.out.println("Logout de usuario: " + email);
            tokenBlacklistRepository.invalidateToken(token);
        } catch (Exception e) {
            throw new RuntimeException("Token inválido");
        }
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
