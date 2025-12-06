package com.example.auth_service.dto;


public class AuthResponse {

    private String token;
    private Long userId;
    private String roles;

    public AuthResponse(String token, Long userId, String roles) {
        this.token = token;
        this.userId = userId;
        this.roles = roles;
    }

    public String getToken() { return token; }
    public Long getUserId() { return userId; }
    public String getRoles() { return roles; }
}
