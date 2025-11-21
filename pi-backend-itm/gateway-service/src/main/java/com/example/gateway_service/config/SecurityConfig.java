package com.example.gateway_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {

        return http
                .csrf(ServerHttpSecurity.CsrfSpec::disable)  // 🔥 DESACTIVA CSRF CORRECTAMENTE
                .formLogin(ServerHttpSecurity.FormLoginSpec::disable) // 🔥 DESACTIVA FORM LOGIN POR DEFECTO
                .httpBasic(ServerHttpSecurity.HttpBasicSpec::disable) // 🔥 DESACTIVA BASIC AUTH
                .authorizeExchange(auth -> auth
                        .pathMatchers("/api/auth/**").permitAll()
                        .pathMatchers("/api/users/register").permitAll()
                        .pathMatchers("/api/users/validate-credentials").permitAll()
                        .pathMatchers("/swagger/**", "/swagger-ui/**", "/v3/api-docs/**", "/actuator/**").permitAll()
                        .anyExchange().permitAll()
                )
                .build();
    }
}
