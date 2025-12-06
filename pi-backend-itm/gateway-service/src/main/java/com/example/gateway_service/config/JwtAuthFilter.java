package com.example.gateway_service.config;
import com.example.gateway_service.utils.JwtUtil;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Configuration
public class JwtAuthFilter implements GlobalFilter {

    private final JwtUtil jwtUtil;

    public JwtAuthFilter(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange,
                             org.springframework.cloud.gateway.filter.GatewayFilterChain chain) {

        String path = exchange.getRequest().getPath().value();

        // ============================================================
        // WHITELIST
        // ============================================================
        if (
                path.startsWith("/api/auth/")
                        || path.startsWith("/swagger")
                        || path.startsWith("/swagger-ui")
                        || path.startsWith("/v3/api-docs")
                        || path.startsWith("/actuator")
                        || path.startsWith("/api/users/register")
                        || path.startsWith("/api/users/validate-credentials")
        ) {
            return chain.filter(exchange);
        }

        // ============================================================
        // EXTRACT JWT FROM HEADER
        // ============================================================

        String authHeader = exchange.getRequest().getHeaders().getFirst("Authorization");

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }

        String token = authHeader.substring(7);

        try {
            var claims = jwtUtil.extractAllClaims(token);

            Long userId = claims.get("id", Integer.class).longValue();
            String roles = claims.get("roles").toString().replace("[", "").replace("]", "");

            // ============================================================
            // MUTATE REQUEST → ADD HEADERS
            // ============================================================

            var mutatedRequest = exchange.getRequest().mutate()
                    .header("X-USER-ID", userId.toString())
                    .header("X-USER-ROLES", roles)
                    .build();

            var mutatedExchange = exchange.mutate()
                    .request(mutatedRequest)
                    .build();

            return chain.filter(mutatedExchange);

        } catch (Exception e) {
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }
    }
}