package com.example.digital_payment_molina.users_service.feign;

import com.example.digital_payment_molina.users_service.model.AuthRequest;
import com.example.digital_payment_molina.users_service.model.AuthResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "auth-service")
public interface AuthClient {

    @PostMapping("/api/auth/login")
    AuthResponse login(@RequestBody AuthRequest request);

    @PostMapping("/api/auth/logout")
    void logout(@RequestHeader("Authorization") String token);
}
