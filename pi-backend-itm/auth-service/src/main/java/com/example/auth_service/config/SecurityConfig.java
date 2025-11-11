package com.example.auth_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        // ✅ Se permite libremente acceder a los endpoints de autenticación
                        .requestMatchers("/api/auth/**").permitAll()
                        // ❌ Bloquear cualquier otro endpoint interno
                        .anyRequest().authenticated()
                )
                .build();
    }
}

