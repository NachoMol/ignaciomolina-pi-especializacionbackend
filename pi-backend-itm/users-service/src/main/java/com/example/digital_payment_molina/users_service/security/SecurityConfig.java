package com.example.digital_payment_molina.users_service.security;

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
                .headers(headers -> headers.frameOptions(frame -> frame.disable()))
                .authorizeHttpRequests(auth -> auth
                        // Endpoints públicos (para pruebas locales y Auth-Service)
                        .requestMatchers(
                                "/api/users/register",
                                "/api/users/login",
                                "/api/users/validate-credentials",
                                "/h2-console/**",
                                "/swagger-ui.html",
                                "/swagger-ui/**",
                                "/v3/api-docs/**",
                                "/swagger-resources/**",
                                "/webjars/**"
                        ).permitAll()
                        // El resto, autenticado (ya filtrado por Gateway)
                        .anyRequest().authenticated()
                )
                .build();
    }
}
