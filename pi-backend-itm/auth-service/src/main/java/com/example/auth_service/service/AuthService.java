package com.example.auth_service.service;

import com.example.auth_service.feign.UsersClient;
import com.example.auth_service.dto.AuthRequest;
import com.example.auth_service.dto.AuthResponse;
import com.example.auth_service.repository.TokenBlacklistRepository;
import com.example.auth_service.util.JwtUtil;
import feign.FeignException;
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

    // ✅ Login real vía users-service (validación de email/pass)
    public AuthResponse login(AuthRequest request) {

        try {
            Boolean valid = usersClient.validateCredentials(
                    request.getEmail(),
                    request.getPassword()
            );

            if (valid == null || !valid) {
                throw new IllegalArgumentException("Email o contraseña incorrectos");
            }

        } catch (FeignException.NotFound e) {
            // Usuario inexistente
            throw new IllegalArgumentException("Usuario (email) inexistente");

        } catch (FeignException.BadRequest e) {
            // Error de validación: email vacío, password vacía, formatos inválidos
            throw new IllegalArgumentException("Email o contraseña inválidos");

        } catch (FeignException.Unauthorized e) {
            // Credenciales inválidas
            throw new IllegalArgumentException("Email o contraseña incorrectos");

        } catch (Exception e) {
            throw new RuntimeException("Error interno al validar credenciales");
        }

        // 🟢 Validación exitosa → generar token JWT
        String token = jwtUtil.generateToken(request.getEmail());
        return new AuthResponse(token);
    }

    // 🔒 Logout → invalidar token en blacklist
    public void logout(String token) {

        if (token == null || token.isBlank()) {
            throw new RuntimeException("Token vacío o no proporcionado");
        }

        // Aceptar Authorization: Bearer X o solo X
        token = token.replace("Bearer ", "").trim();

        // Validar token
        if (!jwtUtil.validateToken(token)) {
            throw new RuntimeException("Token inválido o expirado");
        }

        // Guardar en blacklist
        tokenBlacklistRepository.invalidateToken(token);
    }

    // Validación usada por Gateway
    public boolean validate(String token) {
        if (!tokenBlacklistRepository.isTokenValid(token)) {
            return false;
        }
        return jwtUtil.validateToken(token);
    }
}
