package com.example.auth_service.service;
import com.example.auth_service.dto.AuthRequest;
import com.example.auth_service.dto.AuthResponse;
import com.example.auth_service.util.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final JwtUtil jwtUtil;

    public AuthService(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    // En un entorno real, validarías contra el Users-Service o la DB
    public AuthResponse login(AuthRequest request) {
        if ("test@correo.com".equals(request.getEmail()) && "1234".equals(request.getPassword())) {
            String token = jwtUtil.generateToken(request.getEmail());
            return new AuthResponse(token);
        } else {
            throw new RuntimeException("Credenciales inválidas");
        }
    }

    public boolean validate(String token) {
        return jwtUtil.validateToken(token);
    }
}