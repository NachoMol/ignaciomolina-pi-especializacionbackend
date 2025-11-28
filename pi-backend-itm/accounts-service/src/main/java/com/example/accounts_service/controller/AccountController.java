package com.example.accounts_service.controller;

import com.example.accounts_service.dto.AccountDTO;
import com.example.accounts_service.dto.TransactionDTO;
import com.example.accounts_service.model.Account;
import com.example.accounts_service.service.AccountService;
import com.example.accounts_service.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService,
                             TransactionService transactionService) {
        this.accountService = accountService;
        this.transactionService = transactionService;
    }

    private final TransactionService transactionService;



    // Crear cuenta
    @PostMapping
    public ResponseEntity<AccountDTO> createAccount(@RequestBody AccountDTO dto) {
        Account created = accountService.createAccountFromDTO(dto);

        AccountDTO response = AccountDTO.builder()
                .id(created.getId())
                .userId(created.getUserId())
                .cvu(created.getCvu())
                .alias(created.getAlias())
                .saldoDisponible(created.getSaldoDisponible())
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    // ✔ Obtener cuenta por ID de usuario (primero el específico)
    @GetMapping("/user/{userId}")
    public ResponseEntity<AccountDTO> getAccountByUser(@PathVariable Long userId) {

        Account account = accountService.getByUserId(userId);

        AccountDTO dto = AccountDTO.builder()
                .id(account.getId())
                .userId(account.getUserId())
                .cvu(account.getCvu())
                .alias(account.getAlias())
                .saldoDisponible(account.getSaldoDisponible())
                .build();

        return ResponseEntity.ok(dto);
    }

    // ✔ Obtener cuenta por ID de la cuenta (después el genérico)
    @GetMapping("/{id}")
    public ResponseEntity<?> getAccountById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(accountService.getAccountById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }



    // Actualizar cuenta (PATCH)
    @PatchMapping("/{id}")
    public ResponseEntity<?> updateAccount(
            @PathVariable Long id,
            @RequestBody Map<String, Object> updates) {

        try {
            return ResponseEntity.ok(accountService.updateAccount(id, updates));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    // Obtener todas las cuentas
    @GetMapping
    public ResponseEntity<List<Account>> getAll() {
        return ResponseEntity.ok(accountService.findAll());
    }

    @GetMapping("/{id}/transactions")
    public ResponseEntity<?> getLastTransactions(@PathVariable Long id) {
        try {
            List<TransactionDTO> txs = transactionService.getLastTransactions(id);
            return ResponseEntity.ok(txs);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al obtener transacciones");
        }
    }

    // Cargar saldo en la cuenta
    @PostMapping("/{id}/deposit")
    public ResponseEntity<?> deposit(
            @PathVariable Long id,
            @RequestBody Map<String, Object> body) {

        try {
            Object amountObj = body.get("amount");
            if (amountObj == null) {
                return ResponseEntity.badRequest().body("El campo 'amount' es obligatorio");
            }

            Double amount = Double.valueOf(amountObj.toString());

            String description = null;
            if (body.containsKey("description") && body.get("description") != null) {
                description = body.get("description").toString();
            }

            AccountDTO updated = accountService.deposit(id, amount, description);
            return ResponseEntity.ok(updated);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al realizar el depósito");
        }
    }

    // Debitar saldo de la cuenta
    @PostMapping("/{id}/debit")
    public ResponseEntity<?> debit(
            @PathVariable Long id,
            @RequestBody Map<String, Object> body) {

        try {
            Object amountObj = body.get("amount");
            if (amountObj == null) {
                return ResponseEntity.badRequest().body("El campo 'amount' es obligatorio");
            }

            Double amount = Double.valueOf(amountObj.toString());

            String description = null;
            if (body.containsKey("description") && body.get("description") != null) {
                description = body.get("description").toString();
            }

            AccountDTO updated = accountService.debit(id, amount, description);
            return ResponseEntity.ok(updated);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (RuntimeException e) {
            // acá entraría "Saldo insuficiente" o "Cuenta no encontrada"
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al debitar saldo");
        }
    }



}
