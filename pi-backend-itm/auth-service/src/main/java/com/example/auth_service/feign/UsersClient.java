package com.example.auth_service.feign;

import com.example.auth_service.dto.UserAuthDTO;
import com.example.auth_service.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Este endpoint puede ser adaptado según tu UsersController real
@FeignClient(name = "users-service")
public interface UsersClient {

    @GetMapping("/api/users/validate-credentials")
    boolean validateCredentials(@RequestParam("email") String email,
                                @RequestParam("password") String password);

    @GetMapping("/api/users/email")
    UserAuthDTO getUserByEmail(@RequestParam("email") String email);
}
