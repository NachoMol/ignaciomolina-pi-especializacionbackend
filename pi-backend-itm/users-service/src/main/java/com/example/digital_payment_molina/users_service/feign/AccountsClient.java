package com.example.digital_payment_molina.users_service.feign;

import com.example.digital_payment_molina.users_service.dto.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "accounts-service") // nombre en Eureka
public interface AccountsClient {

    @PostMapping("/api/accounts")
    AccountDTO createAccount(@RequestBody AccountDTO account);
}