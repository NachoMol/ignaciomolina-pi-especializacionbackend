package com.example.digital_payment_molina.users_service.controller;

import com.example.digital_payment_molina.users_service.dto.UserDTO;
import com.example.digital_payment_molina.users_service.model.AuthResponse;
import com.example.digital_payment_molina.users_service.model.User;
import com.example.digital_payment_molina.users_service.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // ✅ Registro de usuario
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        try {
            UserDTO response = userService.registerUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Error al registrar usuario");
        }
    }

    // ✅ Login (ahora delega al Auth-Service)
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User loginRequest) {
        try {
            AuthResponse authResponse = userService.userLogin(loginRequest.getEmail(), loginRequest.getPassword());
            return ResponseEntity.ok(authResponse);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error al iniciar sesión");
        }
    }

    // ✅ Logout (también delegado al Auth-Service)
    @PostMapping("/logout")
    public ResponseEntity<String> logout(@RequestHeader("Authorization") String token) {
        try {
            userService.logout(token);
            return ResponseEntity.ok("Sesión cerrada correctamente");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al cerrar sesión");
        }
    }

    // ✅ Obtener todos los usuarios (protegido por Gateway)
    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

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

}
