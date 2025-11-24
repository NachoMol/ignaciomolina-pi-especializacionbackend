package com.example.gateway_service.config;

import com.example.gateway_service.client.AuthWebClient;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Configuration
public class JwtAuthFilter implements GlobalFilter {

    private final AuthWebClient authWebClient;

    public JwtAuthFilter(AuthWebClient authWebClient) {
        this.authWebClient = authWebClient;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange,
                             org.springframework.cloud.gateway.filter.GatewayFilterChain chain) {

        String path = exchange.getRequest().getPath().value();
        System.out.println(">>> PATH RECIBIDO POR EL GATEWAY = " + path);

        // ============================================================
        // WHITELIST
        // ============================================================
        if (
                path.startsWith("/api/auth/")
                        || path.startsWith("/auth-service/api/auth/")
                        || path.startsWith("/api/users/register")
                        || path.startsWith("/api/users/validate-credentials")
                        || path.startsWith("/users-service/api/users/register")
                        || path.startsWith("/users-service/api/users/validate-credentials")
                        || path.startsWith("/swagger")
                        || path.startsWith("/swagger-ui")
                        || path.startsWith("/v3/api-docs")
                        || path.startsWith("/actuator")
        ) {
            return chain.filter(exchange);
        }

        // ============================================================
        // VALIDACIÓN JWT
        // ============================================================

        String authHeader = exchange.getRequest().getHeaders().getFirst("Authorization");

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }

        // Validación reactiva SIN block()
        return authWebClient.validate(authHeader)
                .flatMap(isValid -> {

                    System.out.println(">>> TOKEN VALID? = " + isValid);

                    if (!isValid) {
                        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
                        return exchange.getResponse().setComplete();
                    }

                    // Token válido → continuar
                    return chain.filter(exchange);
                });
    }
}
