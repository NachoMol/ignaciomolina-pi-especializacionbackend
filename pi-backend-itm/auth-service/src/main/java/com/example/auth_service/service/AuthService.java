package com.example.auth_service.service;

import com.example.auth_service.dto.UserAuthDTO;
import com.example.auth_service.dto.UserDTO;
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

        // Validaciones simples
        if (request.getEmail() == null || request.getEmail().isBlank()) {
            throw new IllegalArgumentException("El email es obligatorio");
        }

        if (request.getPassword() == null || request.getPassword().isBlank()) {
            throw new IllegalArgumentException("La contraseña es obligatoria");
        }

        try {
            // 1️⃣ Validar credenciales vía users-service
            Boolean valid = usersClient.validateCredentials(
                    request.getEmail(),
                    request.getPassword()
            );

            if (valid == null || !valid) {
                // Esto cubre password incorrecta
                throw new IllegalArgumentException("Email o contraseña incorrectos");
            }

            // 2️⃣ Obtener usuario desde users-service
            UserAuthDTO user = usersClient.getUserByEmail(request.getEmail());

            // 3️⃣ Generar token
            String rolesCsv = String.join(",", user.getRoles());
            String token = jwtUtil.generateToken(user.getId(), user.getEmail(), rolesCsv);

            return new AuthResponse(token, user.getId(), rolesCsv);

        } catch (FeignException.NotFound e) {
            // Usuario inexistente → 404
            throw new IllegalArgumentException("Usuario inexistente");

        } catch (FeignException.Unauthorized e) {
            // Password incorrecta → 401 lógico, pero devolvemos 400 para mantener compatibilidad
            throw new IllegalArgumentException("Email o contraseña incorrectos");

        } catch (FeignException.BadRequest e) {
            throw new IllegalArgumentException("Email o contraseña inválidos");

        } catch (IllegalArgumentException e) {
            // Esto permite devolver el mensaje real al handler
            throw e;

        } catch (Exception e) {
            // Este catch solo captura errores inesperados
            e.printStackTrace(); // para verlos en consola
            throw new RuntimeException("Error interno al autenticar");
        }
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
