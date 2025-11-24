package com.example.gateway_service.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class AuthWebClient {

    private final WebClient webClient;

    public AuthWebClient(WebClient.Builder builder) {
        this.webClient = builder
                // 👇 Ojo acá: ahora apuntamos explícitamente al puerto 8083
                .baseUrl("http://auth-service:8083")
                .build();
    }

    public Mono<Boolean> validate(String authHeader) {
        // Si no viene Authorization o no empieza con Bearer, ya es inválido
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            return Mono.just(false);
        }

        String token = authHeader.replace("Bearer ", "").trim();

        System.out.println(">>> TOKEN QUE ENVIA GATEWAY A AUTH-SERVICE = Bearer " + token);

        return webClient.get()
                .uri("/api/auth/validate")
                .header("Authorization", "Bearer " + token)
                .retrieve()
                .bodyToMono(Boolean.class)
                .onErrorResume(e -> {
                    System.out.println(">>> ERROR VALIDANDO TOKEN EN AUTH-SERVICE: " + e.getMessage());
                    return Mono.just(false);
                });
    }
}
