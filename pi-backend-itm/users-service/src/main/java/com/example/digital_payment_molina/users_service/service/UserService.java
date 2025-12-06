package com.example.digital_payment_molina.users_service.service;

import com.example.digital_payment_molina.users_service.dto.*;
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
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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

    public UserDTO registerUser(RegisterRequestDTO request) {

        // Validación de email duplicado
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("El email ya está registrado");
        }

        // Construcción del usuario
        User user = new User();
        user.setNyap(
                request.getNyap()
                        .trim()
                        .replace(" ", ".")
                        .toLowerCase()
        );
        user.setDni(request.getDni());
        user.setEmail(request.getEmail());
        user.setTelefono(request.getTelefono());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        // Rol USER
        Role userRole = roleRepository.findByName("USER")
                .orElseThrow(() -> new RuntimeException("Rol USER no encontrado"));
        user.getRoles().add(userRole);

        // Guardar usuario
        User saved = userRepository.save(user);

        // Crear cuenta en accounts-service
        AccountDTO account = AccountDTO.builder()
                .userId(saved.getId())
                .saldoDisponible(0.0)
                .build();

        try {
            accountsClient.createAccount(account);
        } catch (Exception e) {
            System.err.println("⚠️ Error al crear cuenta: " + e.getMessage());
        }

        // Retorno final
        return new UserDTO(
                saved.getId(),
                saved.getNyap(),
                saved.getDni(),
                saved.getEmail(),
                saved.getTelefono()
        );
    }


    public AuthResponse userLogin(String email, String rawPassword) {

        // 🔒 Validaciones mínimas de seguridad
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("El email es obligatorio");
        }

        if (rawPassword == null || rawPassword.isBlank()) {
            throw new IllegalArgumentException("La contraseña es obligatoria");
        }

        // 🔍 Verificar si existe el usuario
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsuarioNoEncontradoException("Usuario (email) inexistente"));

        // 🔑 Validar contraseña
        if (!passwordEncoder.matches(rawPassword, user.getPassword())) {
            throw new ContrasenaIncorrectaException("Email o contraseña incorrectos");
        }

        // 🔐 Delegar autenticación real al Auth-Service
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

    public boolean validateCredentials(String email, String rawPassword) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsuarioNoEncontradoException("Usuario no encontrado"));
        return passwordEncoder.matches(rawPassword, user.getPassword());
    }

    public UserProfileDTO getUserProfile(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UsuarioNoEncontradoException("Usuario no encontrado con id " + id));

        // Llamar a accounts-service
        AccountDTO account = accountsClient.getAccountByUserId(id);

        // Construir perfil final
        return new UserProfileDTO(
                user.getId(),
                user.getNyap(),
                user.getDni(),
                user.getEmail(),
                user.getTelefono(),
                account.getCvu(),
                account.getAlias(),
                account.getSaldoDisponible()
        );
    }

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UsuarioNoEncontradoException("Usuario no encontrado: " + id));

        return new UserDTO(
                user.getId(),
                user.getNyap(),
                user.getDni(),
                user.getEmail(),
                user.getTelefono()
        );
    }

    public UserAuthDTO getByEmail(String email) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsuarioNoEncontradoException("Usuario no encontrado con email: " + email));

        Set<String> roles = user.getRoles()
                .stream()
                .map(Role::getName)
                .collect(Collectors.toSet());

        return new UserAuthDTO(
                user.getId(),
                user.getEmail(),
                roles
        );
    }

    public UserDTO updateUser(Long id, Map<String, Object> updates) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UsuarioNoEncontradoException("Usuario no encontrado: " + id));

        if (updates.containsKey("nyap")) {
            user.setNyap(updates.get("nyap").toString());
        }
        if (updates.containsKey("email")) {
            user.setEmail(updates.get("email").toString());
        }
        if (updates.containsKey("telefono")) {
            user.setTelefono(updates.get("telefono").toString());
        }

        User saved = userRepository.save(user);

        return new UserDTO(
                saved.getId(),
                saved.getNyap(),
                saved.getDni(),
                saved.getEmail(),
                saved.getTelefono()
        );
    }



}
