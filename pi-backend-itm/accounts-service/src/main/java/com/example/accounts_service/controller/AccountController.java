package com.example.accounts_service.controller;

import com.example.accounts_service.dto.AccountDTO;
import com.example.accounts_service.model.Account;
import com.example.accounts_service.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // 🔹 Recibe un AccountDTO (no la entidad completa)
    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody AccountDTO dto) {
        // Lógica delegada al servicio: él se encarga de generar alias y cvu
        Account created = accountService.createAccountFromDTO(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Account> getAccountByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(accountService.getByUserId(userId));
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAll() {
        return ResponseEntity.ok(accountService.findAll());
    }
}
