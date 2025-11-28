package com.example.digital_payment_molina.users_service.feign;

import com.example.digital_payment_molina.users_service.dto.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "accounts-service")
public interface AccountsClient {

    @PostMapping("/api/accounts")
    AccountDTO createAccount(@RequestBody AccountDTO account);

    @GetMapping("/api/accounts/user/{userId}")
    AccountDTO getAccountByUserId(@PathVariable Long userId);
}