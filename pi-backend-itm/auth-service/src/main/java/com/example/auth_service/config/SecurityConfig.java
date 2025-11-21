package com.example.auth_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        // PERMITIR POST /login
                        .requestMatchers(HttpMethod.POST, "/api/auth/login").permitAll()
                        // PERMITIR GET /validate
                        .requestMatchers(HttpMethod.GET, "/api/auth/validate").permitAll()
                        // PERMITIR TODO LO DEMÁS EN api/auth/
                        .requestMatchers("/api/auth/**").permitAll()
                        // TODO LO DEMÁS REQUIERE TOKEN
                        .anyRequest().authenticated()
                )
                .build();
    }
}
