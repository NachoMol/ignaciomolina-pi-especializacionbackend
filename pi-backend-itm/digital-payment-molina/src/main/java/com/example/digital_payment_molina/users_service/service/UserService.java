package com.example.digital_payment_molina.users_service.service;


import com.example.digital_payment_molina.users_service.dto.UserDTO;
import com.example.digital_payment_molina.users_service.exceptions.ContrasenaIncorrectaException;
import com.example.digital_payment_molina.users_service.exceptions.UsuarioNoEncontradoException;
import com.example.digital_payment_molina.users_service.model.User;
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
    private JwtUtil jwtUtil;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    private final List<String> aliasWords;

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


}
