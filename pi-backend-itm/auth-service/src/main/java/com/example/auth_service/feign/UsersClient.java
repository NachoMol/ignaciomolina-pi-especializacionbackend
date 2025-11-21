package com.example.auth_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Este endpoint puede ser adaptado según tu UsersController real
@FeignClient(name = "users-service")
public interface UsersClient {

    @GetMapping("/api/users/validate-credentials")
    boolean validateCredentials(@RequestParam("email") String email,
                                @RequestParam("password") String password);
}
