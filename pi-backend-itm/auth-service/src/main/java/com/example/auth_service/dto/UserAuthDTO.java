package com.example.auth_service.dto;

import java.util.Set;

public class UserAuthDTO {

    private Long id;
    private String email;
    private Set<String> roles;

    public UserAuthDTO() {}

    public UserAuthDTO(Long id, String email, Set<String> roles) {
        this.id = id;
        this.email = email;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public Set<String> getRoles() {
        return roles;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}
