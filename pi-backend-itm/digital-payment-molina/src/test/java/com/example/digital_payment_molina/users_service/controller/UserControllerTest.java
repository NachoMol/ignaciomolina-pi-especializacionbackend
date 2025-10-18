package com.example.digital_payment_molina.users_service.controller;

import com.example.digital_payment_molina.users_service.dto.UserDTO;
import com.example.digital_payment_molina.users_service.dto.LoginRequestDTO;
import com.example.digital_payment_molina.users_service.repository.TokenBlacklistRepository;
import com.example.digital_payment_molina.users_service.security.JwtUtil;
import com.example.digital_payment_molina.users_service.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
@Import(TestSecurityConfig.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @MockBean
    private JwtUtil jwtUtil;

    @MockBean
    private TokenBlacklistRepository tokenBlacklistRepository;

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    void registerUserShouldReturnTrue() throws Exception {
        UserDTO response = new UserDTO(1L, "Nacho Molina", "12345678", "nacho@test.com", "1234", "CVU123", "alias.test");

        Mockito.when(userService.registerUser(any())).thenReturn(response);

        mockMvc.perform(post("/api/users/register")
                        .with(csrf())  // 👈 agrega token CSRF válido
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"email\":\"nacho@test.com\",\"password\":\"1234\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.email").value("nacho@test.com"));
    }

    @Test
    void loginUserShouldReturnTrue() throws Exception {
        Mockito.when(userService.userLogin("nacho@test.com", "1234")).thenReturn("fake-jwt");

        LoginRequestDTO request = new LoginRequestDTO();
        request.setEmail("nacho@test.com");
        request.setPassword("1234");

        mockMvc.perform(post("/api/users/login")
                        .with(csrf())  // 👈 también acá
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.token").value("fake-jwt"));
    }
}
