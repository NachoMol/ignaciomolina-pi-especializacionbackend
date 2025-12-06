package com.example.digital_payment_molina.users_service.controller;

import com.example.digital_payment_molina.users_service.dto.*;
import com.example.digital_payment_molina.users_service.exceptions.UsuarioNoEncontradoException;
import com.example.digital_payment_molina.users_service.model.AuthResponse;
import com.example.digital_payment_molina.users_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private static final String HEADER_USER_ID = "X-USER-ID";
    private static final String HEADER_USER_ROLES = "X-USER-ROLES";

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // ================================
    // AUTH
    // ================================



    // 🔒 Helper: ¿es ADMIN?
    private boolean isAdmin(String rolesHeader) {
        if (rolesHeader == null) return false;
        return rolesHeader.toUpperCase().contains("ADMIN");
    }

    // 🔒 Helper: ¿es el mismo usuario o ADMIN?
    private boolean isSameUserOrAdmin(Long pathId, Long authUserId, String rolesHeader) {
        if (authUserId != null && pathId != null && authUserId.equals(pathId)) {
            return true;
        }
        return isAdmin(rolesHeader);
    }


    // Registro
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody RegisterRequestDTO request) {
        try {
            UserDTO response = userService.registerUser(request);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error interno del servidor");
        }
    }

    // Login
    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequestDTO request) {
        try {
            AuthResponse token = userService.userLogin(request.getEmail(), request.getPassword());
            return ResponseEntity.ok(token);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error interno del servidor");
        }
    }

    // Logout
    @PostMapping("/logout")
    public ResponseEntity<String> logout(@RequestHeader("Authorization") String token) {
        try {
            userService.logout(token);
            return ResponseEntity.ok("Sesión cerrada correctamente");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al cerrar sesión");
        }
    }

    // ================================
    // USER CRUD
    // ================================

    // GET all users
    @GetMapping
    public ResponseEntity<?> getAllUsers(
            @RequestHeader(HEADER_USER_ROLES) String rolesHeader) {

        if (!isAdmin(rolesHeader)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("No tiene permisos para listar todos los usuarios");
        }

        return ResponseEntity.ok(userService.getAllUsers());
    }

    // GET user by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(
            @PathVariable Long id,
            @RequestHeader(HEADER_USER_ID) Long authUserId,
            @RequestHeader(HEADER_USER_ROLES) String rolesHeader) {

        if (!isSameUserOrAdmin(id, authUserId, rolesHeader)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("No tiene permisos para ver este usuario");
        }

        try {
            UserDTO user = userService.getUserById(id);
            return ResponseEntity.ok(user);
        } catch (UsuarioNoEncontradoException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error al obtener usuario");
        }
    }

    //GET user by email
    @GetMapping("/email")
    public ResponseEntity<?> getByEmail(@RequestParam String email) {
        UserAuthDTO user = userService.getByEmail(email);
        return ResponseEntity.ok(user);
    }


    // PATCH user
    @PatchMapping("/{id}")
    public ResponseEntity<?> updateUser(
            @PathVariable Long id,
            @RequestHeader(HEADER_USER_ID) Long authUserId,
            @RequestHeader(HEADER_USER_ROLES) String rolesHeader,
            @RequestBody Map<String, Object> updates) {

        if (!isSameUserOrAdmin(id, authUserId, rolesHeader)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("No tiene permisos para modificar este usuario");
        }

        try {
            UserDTO updated = userService.updateUser(id, updates);
            return ResponseEntity.ok(updated);
        } catch (UsuarioNoEncontradoException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al actualizar usuario");
        }
    }

    // ================================
    // VALIDATE CREDENTIALS (Auth-Service internal)
    // ================================
    @GetMapping("/validate-credentials")
    public ResponseEntity<Boolean> validateCredentials(
            @RequestParam String email,
            @RequestParam String password) {
        try {
            boolean valid = userService.validateCredentials(email, password);
            return ResponseEntity.ok(valid);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
        }
    }

    // ================================
    // PROFILE (Opción B)
    // ================================
    @GetMapping("/{id}/profile")
    public ResponseEntity<?> getUserProfile(
            @PathVariable Long id,
            @RequestHeader(HEADER_USER_ID) Long authUserId,
            @RequestHeader(HEADER_USER_ROLES) String rolesHeader) {

        if (!isSameUserOrAdmin(id, authUserId, rolesHeader)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("No tiene permisos para ver este perfil");
        }

        try {
            UserProfileDTO profile = userService.getUserProfile(id);
            return ResponseEntity.ok(profile);
        } catch (UsuarioNoEncontradoException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error al obtener perfil");
        }
    }
}
