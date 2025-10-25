package com.example.digital_payment_molina.users_service.service;


import com.example.digital_payment_molina.users_service.dto.UserDTO;
import com.example.digital_payment_molina.users_service.exceptions.ContrasenaIncorrectaException;
import com.example.digital_payment_molina.users_service.exceptions.UsuarioNoEncontradoException;
import com.example.digital_payment_molina.users_service.model.Role;
import com.example.digital_payment_molina.users_service.model.User;
import com.example.digital_payment_molina.users_service.repository.RoleRepository;
import com.example.digital_payment_molina.users_service.repository.TokenBlacklistRepository;
import com.example.digital_payment_molina.users_service.repository.UserRepository;
import com.example.digital_payment_molina.users_service.security.JwtUtil;
import com.example.digital_payment_molina.users_service.utils.Generators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    JwtUtil jwtUtil;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    private final List<String> aliasWords;

    @Autowired
    TokenBlacklistRepository tokenBlacklistRepository;


    public UserService(UserRepository userRepository) throws Exception {
        this.userRepository = userRepository;
        // Cargar alias.txt desde resources
        try (var inputStream = new ClassPathResource("alias.txt").getInputStream()) {
            this.aliasWords = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream))
                    .lines()
                    .toList();
        }
    }

    public UserDTO registerUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email ya registrado");
        }

        // Encriptar contraseña
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Generar CVU y alias
        user.setCvu(Generators.generateCvu());
        user.setAlias(Generators.generateAlias(aliasWords));

        Role userRole = roleRepository.findByName("USER")
                .orElseThrow(() -> new RuntimeException("Rol USER no encontrado. Asegúrate de inicializar los roles."));
        user.getRoles().add(userRole);


        User saved = userRepository.save(user);

        return new UserDTO(
                saved.getId(),
                saved.getNyap(),
                saved.getDni(),
                saved.getEmail(),
                saved.getTelefono(),
                saved.getCvu(),
                saved.getAlias()
        );
    }

    public String userLogin(String email, String rawPassword) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsuarioNoEncontradoException("Usuario (email) inexistente "));

        if (!passwordEncoder.matches(rawPassword, user.getPassword())) {
            throw new ContrasenaIncorrectaException("Email o contraseña incorrectos");
        }

        return jwtUtil.generateToken(email);
    }

    public void logout(String token) {
        // Si el token viene con "Bearer ", limpiarlo
        if (token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        try {
            // Verificar que sea un token JWT válido
            String email = jwtUtil.extractEmail(token);
            System.out.println("Logout de usuario: " + email);

            // Guardarlo en blacklist
            tokenBlacklistRepository.invalidateToken(token);

        } catch (Exception e) {
            // Si no es un token válido → lanzar excepción
            throw new RuntimeException("Token inválido");
        }
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


}
