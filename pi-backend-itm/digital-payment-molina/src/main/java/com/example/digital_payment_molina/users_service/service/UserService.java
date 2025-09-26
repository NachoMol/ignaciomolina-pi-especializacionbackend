package com.example.digital_payment_molina.users_service.service;


import com.example.digital_payment_molina.users_service.dto.UserDto;
import com.example.digital_payment_molina.users_service.model.User;
import com.example.digital_payment_molina.users_service.repository.UserRepository;
import com.example.digital_payment_molina.users_service.utils.Generators;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    private final List<String> aliasWords;

    public UserService(UserRepository userRepository) throws Exception {
        this.userRepository = userRepository;
        // Cargar palabras de alias.txt
        this.aliasWords = Files.readAllLines(Paths.get("src/main/resources/alias.txt"));
    }

    public UserDto registerUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email ya registrado");
        }

        // Encriptar contraseña
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Generar CVU y alias
        user.setCvu(Generators.generateCvu());
        user.setAlias(Generators.generateAlias(aliasWords));

        User saved = userRepository.save(user);

        return new UserDto(
                saved.getId(),
                saved.getNyap(),
                saved.getDni(),
                saved.getEmail(),
                saved.getTelefono(),
                saved.getCvu(),
                saved.getAlias()
        );
    }

}
