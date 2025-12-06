package com.example.accounts_service.controller;

import com.example.accounts_service.dto.AccountDTO;
import com.example.accounts_service.dto.CardDTO;
import com.example.accounts_service.dto.TransactionDTO;
import com.example.accounts_service.model.Account;
import com.example.accounts_service.service.AccountService;
import com.example.accounts_service.service.CardService;
import com.example.accounts_service.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private static final String HEADER_USER_ID = "X-USER-ID";
    private static final String HEADER_USER_ROLES = "X-USER-ROLES";

    private final AccountService accountService;
    private final TransactionService transactionService;
    private final CardService cardService;

    public AccountController(AccountService accountService,
                             TransactionService transactionService, CardService cardService) {
        this.accountService = accountService;
        this.transactionService = transactionService;
        this.cardService = cardService;
    }



    // 🔒 Helper: validar que la cuenta pertenece al usuario autenticado
    private boolean isOwner(Long accountId, Long authUserId) {
        if (accountId == null || authUserId == null) return false;
        Account acc = accountService.getAccountEntityById(accountId);
        return authUserId.equals(acc.getUserId());
    }


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


    // ✔ Obtener cuenta por ID de usuario
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

    // ✔ Obtener cuenta por ID de la cuenta
    @GetMapping("/{id}")
    public ResponseEntity<?> getAccountById(
            @PathVariable Long id,
            @RequestHeader(HEADER_USER_ID) Long authUserId) {

        if (!isOwner(id, authUserId)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("No tiene permisos para ver esta cuenta");
        }

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
    public ResponseEntity<?> getLastTransactions(
            @PathVariable Long id,
            @RequestHeader(HEADER_USER_ID) Long authUserId) {

        if (!isOwner(id, authUserId)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("No tiene permisos para ver las transacciones de esta cuenta");
        }

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
            @RequestHeader(HEADER_USER_ID) Long authUserId,
            @RequestBody Map<String, Object> body) {

        if (!isOwner(id, authUserId)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("No tiene permisos para operar esta cuenta");
        }

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
            @RequestHeader(HEADER_USER_ID) Long authUserId,
            @RequestBody Map<String, Object> body) {

        if (!isOwner(id, authUserId)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("No tiene permisos para operar esta cuenta");
        }

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
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al debitar de la cuenta");
        }
    }

    // Lista todas las tarjetas de una cuenta
    @GetMapping("/{id}/cards")
    public ResponseEntity<?> getCards(
            @PathVariable Long id,
            @RequestHeader("X-USER-ID") Long authUserId) {

        // 🔒 Validar que la cuenta pertenece al usuario autenticado
        if (!isOwner(id, authUserId)) {
            return ResponseEntity.status(403)
                    .body("No tiene permisos para ver las tarjetas de esta cuenta");
        }

        try {
            List<CardDTO> cards = cardService.getCards(id);
            return ResponseEntity.ok(cards); // lista vacía o con tarjetas
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al obtener tarjetas");
        }
    }

    @GetMapping("/{id}/cards/{cardId}")
    public ResponseEntity<?> getCard(
            @PathVariable Long id,
            @PathVariable Long cardId,
            @RequestHeader("X-USER-ID") Long authUserId) {

        // 🔒 Validar que la cuenta pertenece al usuario autenticado
        if (!isOwner(id, authUserId)) {
            return ResponseEntity.status(403)
                    .body("No tiene permisos para ver las tarjetas de esta cuenta");
        }

        try {
            CardDTO card = cardService.getCard(id, cardId);
            return ResponseEntity.ok(card);
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al obtener la tarjeta");
        }
    }

    @PostMapping("/{id}/cards")
    public ResponseEntity<?> createCard(
            @PathVariable Long id,
            @RequestHeader("X-USER-ID") Long authUserId,
            @RequestBody CardDTO dto) {

        // 🔒 Validar que la cuenta pertenece al usuario autenticado
        if (!isOwner(id, authUserId)) {
            return ResponseEntity.status(403)
                    .body("No tiene permisos para agregar tarjetas a esta cuenta");
        }

        try {
            CardDTO created = cardService.createCard(id, dto);
            return ResponseEntity.status(201).body(created);

        } catch (RuntimeException e) {
            if (e.getMessage() != null && e.getMessage().contains("ya asociada")) {
                return ResponseEntity.status(409).body(e.getMessage());
            }
            return ResponseEntity.status(400).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al crear tarjeta");
        }
    }

    @DeleteMapping("/{id}/cards/{cardId}")
    public ResponseEntity<?> deleteCard(
            @PathVariable Long id,
            @PathVariable Long cardId,
            @RequestHeader("X-USER-ID") Long authUserId) {

        // 🔒 Validar que la cuenta pertenece al usuario autenticado
        if (!isOwner(id, authUserId)) {
            return ResponseEntity.status(403)
                    .body("No tiene permisos para eliminar tarjetas de esta cuenta");
        }

        try {
            cardService.deleteCard(id, cardId);
            return ResponseEntity.ok("Tarjeta eliminada correctamente");
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al eliminar la tarjeta");
        }
    }




}
