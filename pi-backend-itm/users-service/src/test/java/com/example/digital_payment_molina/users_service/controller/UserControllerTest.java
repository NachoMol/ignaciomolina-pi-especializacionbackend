package com.example.digital_payment_molina.users_service.controller;

import com.example.digital_payment_molina.users_service.dto.UserDTO;
import com.example.digital_payment_molina.users_service.model.AuthResponse;
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

    private final ObjectMapper mapper = new ObjectMapper();

    // ✅ Test de registro
    @Test
    void registerUserShouldReturnCreated() throws Exception {
        UserDTO response = new UserDTO(1L, "Nacho Molina", "12345678", "nacho@test.com", "1234");

        Mockito.when(userService.registerUser(any())).thenReturn(response);

        mockMvc.perform(post("/api/users/register")
                        .with(csrf())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"email\":\"nacho@test.com\",\"password\":\"1234\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.email").value("nacho@test.com"));
    }

    // ✅ Test de login correcto (usando AuthResponse ahora)
    @Test
    void loginUserShouldReturnAuthResponse() throws Exception {
        AuthResponse fakeResponse = new AuthResponse("fake-jwt-token");

        Mockito.when(userService.userLogin("nacho@test.com", "1234"))
                .thenReturn(fakeResponse);

        String body = """
                {
                    "email": "nacho@test.com",
                    "password": "1234"
                }
                """;

        mockMvc.perform(post("/api/users/login")
                        .with(csrf())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(body))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.token").value("fake-jwt-token"));
    }
}
