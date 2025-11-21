package com.example.auth_service.service;

import com.example.auth_service.feign.UsersClient;
import com.example.auth_service.dto.AuthRequest;
import com.example.auth_service.dto.AuthResponse;
import com.example.auth_service.repository.TokenBlacklistRepository;
import com.example.auth_service.util.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final JwtUtil jwtUtil;
    private final TokenBlacklistRepository tokenBlacklistRepository;
    private final UsersClient usersClient;

    public AuthService(JwtUtil jwtUtil,
                       TokenBlacklistRepository tokenBlacklistRepository,
                       UsersClient usersClient) {
        this.jwtUtil = jwtUtil;
        this.tokenBlacklistRepository = tokenBlacklistRepository;
        this.usersClient = usersClient;
    }

    // ✅ Login real vía users-service
    public AuthResponse login(AuthRequest request) {
        try {
            boolean valid = usersClient.validateCredentials(request.getEmail(), request.getPassword());
            if (valid) {
                String token = jwtUtil.generateToken(request.getEmail());
                return new AuthResponse(token);
            }
            throw new RuntimeException("Credenciales inválidas");
        } catch (Exception e) {
            // fallback por si el users-service no responde
            System.err.println("⚠️ Error al validar credenciales con users-service: " + e.getMessage());
            throw new RuntimeException("No se pudo validar credenciales en users-service");
        }
    }

    public void logout(String token) {

        if (token == null || token.isBlank()) {
            throw new RuntimeException("Token vacío o no proporcionado");
        }

        // Aceptar Authorization: Bearer X o solo X
        token = token.replace("Bearer ", "").trim();

        // 🔍 Validar token
        if (!jwtUtil.validateToken(token)) {
            throw new RuntimeException("Token inválido o expirado");
        }

        // 🗑️ Guardar en blacklist
        tokenBlacklistRepository.invalidateToken(token);
    }

    public boolean validate(String token) {
        if (!tokenBlacklistRepository.isTokenValid(token)) {
            return false;
        }
        return jwtUtil.validateToken(token);
    }
}
