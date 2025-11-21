package com.example.gateway_service.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class AuthWebClient {

    private final WebClient webClient;

    public AuthWebClient(WebClient.Builder builder) {
        this.webClient = builder
                .baseUrl("http://auth-service") // Eureka resolverá el servicio
                .build();
    }

    public boolean validate(String token) {
        try {
            Boolean result = webClient.get()
                    .uri("/api/auth/validate")
                    .header("Authorization", token)
                    .retrieve()
                    .bodyToMono(Boolean.class)
                    .block(); // OK porque es validación simple

            return result != null && result;
        } catch (Exception e) {
            return false;
        }
    }
}

