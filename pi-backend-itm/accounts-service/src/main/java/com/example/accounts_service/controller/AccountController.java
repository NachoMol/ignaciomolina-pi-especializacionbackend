package com.example.accounts_service.controller;

import com.example.accounts_service.dto.AccountDTO;
import com.example.accounts_service.dto.CardDTO;
import com.example.accounts_service.dto.TransactionDTO;
import com.example.accounts_service.model.Account;
import com.example.accounts_service.service.AccountService;
import com.example.accounts_service.service.CardService;
import com.example.accounts_service.service.TransactionService;
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

    // === NUEVO MÉTODO CENTRALIZADO DE PERMISOS ===
    private boolean hasAccess(Long accountId, Long authUserId, String rolesHeader) {
        if (rolesHeader != null && rolesHeader.contains("ADMIN")) {
            return true; // ADMIN puede todo
        }
        Account acc = accountService.getAccountEntityById(accountId);
        return authUserId.equals(acc.getUserId()); // el dueño sí
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

    // Obtener cuenta por ID de usuario
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

    // Obtener cuenta por ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getAccountById(
            @PathVariable Long id,
            @RequestHeader(HEADER_USER_ID) Long authUserId,
            @RequestHeader(HEADER_USER_ROLES) String rolesHeader) {

        if (!hasAccess(id, authUserId, rolesHeader)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("No tiene permisos para ver esta cuenta");
        }

        try {
            return ResponseEntity.ok(accountService.getAccountById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    // Obtener toda la actividad
    @GetMapping("/{id}/activity")
    public ResponseEntity<?> getAllActivity(
            @PathVariable Long id,
            @RequestHeader("X-USER-ID") Long authUserId,
            @RequestHeader("X-USER-ROLES") String rolesHeader) {

        if (!hasAccess(id, authUserId, rolesHeader)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("No tiene permisos para ver la actividad de esta cuenta");
        }

        try {
            List<TransactionDTO> activities = transactionService.getAllTransactions(id);
            return ResponseEntity.ok(activities);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error al obtener la actividad");
        }
    }

    // Obtener detalle de actividad
    @GetMapping("/{id}/activity/{txId}")
    public ResponseEntity<?> getActivityDetail(
            @PathVariable Long id,
            @PathVariable Long txId,
            @RequestHeader("X-USER-ID") Long authUserId,
            @RequestHeader("X-USER-ROLES") String rolesHeader) {

        if (!hasAccess(id, authUserId, rolesHeader)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("No tiene permisos para ver esta actividad");
        }

        try {
            TransactionDTO dto = transactionService.getTransactionById(id, txId);
            return ResponseEntity.ok(dto);

        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error al obtener el detalle de la actividad");
        }
    }

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

    @GetMapping
    public ResponseEntity<List<Account>> getAll() {
        return ResponseEntity.ok(accountService.findAll());
    }

    @GetMapping("/{id}/transactions")
    public ResponseEntity<?> getLastTransactions(
            @PathVariable Long id,
            @RequestHeader(HEADER_USER_ID) Long authUserId,
            @RequestHeader(HEADER_USER_ROLES) String rolesHeader) {

        if (!hasAccess(id, authUserId, rolesHeader)) {
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

    // Depositar saldo
    @PostMapping("/{id}/deposit")
    public ResponseEntity<?> deposit(
            @PathVariable Long id,
            @RequestHeader(HEADER_USER_ID) Long authUserId,
            @RequestHeader(HEADER_USER_ROLES) String rolesHeader,
            @RequestBody Map<String, Object> body) {

        if (!rolesHeader.contains("ADMIN")) {
            return ResponseEntity.status(403)
                    .body("Solo ADMIN puede realizar depósitos directos");
        }

        try {
            Object amountObj = body.get("amount");
            if (amountObj == null) {
                return ResponseEntity.badRequest().body("El campo 'amount' es obligatorio");
            }

            Double amount = Double.valueOf(amountObj.toString());

            String description = body.containsKey("description")
                    ? body.get("description").toString()
                    : null;

            AccountDTO updated = accountService.deposit(id, amount, description);
            return ResponseEntity.ok(updated);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al realizar el depósito");
        }
    }

    // Debitar saldo
    @PostMapping("/{id}/debit")
    public ResponseEntity<?> debit(
            @PathVariable Long id,
            @RequestHeader(HEADER_USER_ID) Long authUserId,
            @RequestHeader(HEADER_USER_ROLES) String rolesHeader,
            @RequestBody Map<String, Object> body) {

        if (!rolesHeader.contains("ADMIN")) {
            return ResponseEntity.status(403)
                    .body("Solo ADMIN puede realizar débitos directos");
        }

        try {
            Object amountObj = body.get("amount");
            if (amountObj == null) {
                return ResponseEntity.badRequest().body("El campo 'amount' es obligatorio");
            }

            Double amount = Double.valueOf(amountObj.toString());

            String description = body.containsKey("description")
                    ? body.get("description").toString()
                    : null;

            AccountDTO updated = accountService.debit(id, amount, description);
            return ResponseEntity.ok(updated);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al debitar la cuenta");
        }
    }


    // Listar tarjetas
    @GetMapping("/{id}/cards")
    public ResponseEntity<?> getCards(
            @PathVariable Long id,
            @RequestHeader("X-USER-ID") Long authUserId,
            @RequestHeader("X-USER-ROLES") String rolesHeader) {

        if (!hasAccess(id, authUserId, rolesHeader)) {
            return ResponseEntity.status(403)
                    .body("No tiene permisos para ver las tarjetas de esta cuenta");
        }

        try {
            List<CardDTO> cards = cardService.getCards(id);
            return ResponseEntity.ok(cards);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al obtener tarjetas");
        }
    }

    // Detalle tarjeta
    @GetMapping("/{id}/cards/{cardId}")
    public ResponseEntity<?> getCard(
            @PathVariable Long id,
            @PathVariable Long cardId,
            @RequestHeader("X-USER-ID") Long authUserId,
            @RequestHeader("X-USER-ROLES") String rolesHeader) {

        if (!hasAccess(id, authUserId, rolesHeader)) {
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

    // Crear tarjeta
    @PostMapping("/{id}/cards")
    public ResponseEntity<?> createCard(
            @PathVariable Long id,
            @RequestHeader("X-USER-ID") Long authUserId,
            @RequestHeader("X-USER-ROLES") String rolesHeader,
            @RequestBody CardDTO dto) {

        if (!hasAccess(id, authUserId, rolesHeader)) {
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

    // Eliminar tarjeta
    @DeleteMapping("/{id}/cards/{cardId}")
    public ResponseEntity<?> deleteCard(
            @PathVariable Long id,
            @PathVariable Long cardId,
            @RequestHeader("X-USER-ID") Long authUserId,
            @RequestHeader("X-USER-ROLES") String rolesHeader) {

        if (!hasAccess(id, authUserId, rolesHeader)) {
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
    @PostMapping("/{id}/transferences")
    public ResponseEntity<?> registerTransference(
            @PathVariable Long id,
            @RequestHeader("X-USER-ID") Long authUserId,
            @RequestHeader("X-USER-ROLES") String rolesHeader,
            @RequestBody Map<String, Object> body) {

        if (!hasAccess(id, authUserId, rolesHeader)) {
            return ResponseEntity.status(403)
                    .body("No tiene permisos para operar esta cuenta");
        }

        try {
            Long cardId = Long.valueOf(body.get("cardId").toString());
            Double amount = Double.valueOf(body.get("amount").toString());

            if (amount <= 0) {
                return ResponseEntity.badRequest().body("El monto debe ser mayor a 0");
            }

            // validar tarjeta
            cardService.getCard(id, cardId);

            // hacer la acreditación
            AccountDTO updated = accountService.deposit(
                    id,
                    amount,
                    "Carga desde tarjeta #" + cardId
            );

            return ResponseEntity.status(201).body(updated);

        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
