package com.example.digital_payment_molina.users_service.service;

import com.example.digital_payment_molina.users_service.dto.UserDTO;
import com.example.digital_payment_molina.users_service.exceptions.ContrasenaIncorrectaException;
import com.example.digital_payment_molina.users_service.exceptions.UsuarioNoEncontradoException;
import com.example.digital_payment_molina.users_service.model.User;
import com.example.digital_payment_molina.users_service.repository.UserRepository;
import com.example.digital_payment_molina.users_service.repository.TokenBlacklistRepository;
import com.example.digital_payment_molina.users_service.security.JwtUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.core.io.ClassPathResource;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

    private UserRepository userRepository;
    private TokenBlacklistRepository tokenBlacklistRepository;
    private JwtUtil jwtUtil;
    private UserService userService;

    @BeforeEach
    void setUp() throws Exception {
        userRepository = mock(UserRepository.class);
        tokenBlacklistRepository = mock(TokenBlacklistRepository.class);
        jwtUtil = mock(JwtUtil.class);

        userService = new UserService(userRepository);
        userService.jwtUtil = jwtUtil;
        userService.tokenBlacklistRepository = tokenBlacklistRepository;
    }

    @Test
    void deberiaRegistrarUsuarioCorrectamente() {
        User user = new User();
        user.setEmail("nuevo@test.com");
        user.setPassword("1234");

        when(userRepository.existsByEmail("nuevo@test.com")).thenReturn(false);
        when(userRepository.save(any(User.class))).thenAnswer(inv -> inv.getArgument(0));

        UserDTO dto = userService.registerUser(user);

        assertNotNull(dto);
        assertEquals("nuevo@test.com", dto.getEmail());
    }

    @Test
    void deberiaFallarSiEmailYaExiste() {
        User user = new User();
        user.setEmail("repetido@test.com");

        when(userRepository.existsByEmail("repetido@test.com")).thenReturn(true);

        assertThrows(RuntimeException.class, () -> userService.registerUser(user));
    }

    @Test
    void deberiaLoguearUsuarioCorrectamente() {
        User user = new User();
        user.setEmail("nacho@test.com");
        user.setPassword(new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder().encode("1234"));

        when(userRepository.findByEmail("nacho@test.com")).thenReturn(Optional.of(user));
        when(jwtUtil.generateToken("nacho@test.com")).thenReturn("fake-jwt");

        String token = userService.userLogin("nacho@test.com", "1234");

        assertEquals("fake-jwt", token);
    }

    @Test
    void deberiaFallarSiUsuarioNoExiste() {
        when(userRepository.findByEmail("inexistente@test.com")).thenReturn(Optional.empty());

        assertThrows(UsuarioNoEncontradoException.class,
                () -> userService.userLogin("inexistente@test.com", "1234"));
    }

    @Test
    void deberiaFallarSiPasswordIncorrecta() {
        User user = new User();
        user.setEmail("nacho@test.com");
        user.setPassword(new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder().encode("correcta"));

        when(userRepository.findByEmail("nacho@test.com")).thenReturn(Optional.of(user));

        assertThrows(ContrasenaIncorrectaException.class,
                () -> userService.userLogin("nacho@test.com", "mal"));
    }
}