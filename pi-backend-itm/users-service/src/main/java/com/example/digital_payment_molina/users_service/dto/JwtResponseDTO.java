package com.example.digital_payment_molina.users_service.dto;

public class JwtResponseDTO {
    private String token;

    public JwtResponseDTO(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

}
