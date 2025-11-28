package com.example.accounts_service.service;

import com.example.accounts_service.dto.AccountDTO;
import com.example.accounts_service.model.Account;
import com.example.accounts_service.repository.AccountRepository;
import com.example.accounts_service.utils.Generators;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final TransactionService transactionService;

    public AccountService(AccountRepository accountRepository,
                          TransactionService transactionService) {
        this.accountRepository = accountRepository;
        this.transactionService = transactionService;
    }

    // ⭐ NUEVO - Método que usan users-service y tus tests
    public AccountDTO createAccount(AccountDTO dto) {
        Account saved = createAccountFromDTO(dto);

        return AccountDTO.builder()
                .id(saved.getId())
                .userId(saved.getUserId())
                .cvu(saved.getCvu())
                .alias(saved.getAlias())
                .saldoDisponible(saved.getSaldoDisponible())
                .build();
    }

    // 🔹 Interno: creación desde DTO con alias/cvu generados
    public Account createAccountFromDTO(AccountDTO dto) {

        Account account = Account.builder()
                .userId(dto.getUserId())
                .saldoDisponible(dto.getSaldoDisponible() != null ? dto.getSaldoDisponible() : 0.0)
                .alias(Generators.generateAlias())
                .cvu(Generators.generateCvu())
                .build();

        Account saved = accountRepository.save(account);

        // ⭐ Registrar movimiento inicial
        transactionService.registerTransaction(
                saved.getId(),
                0.0,
                "Cuenta creada"
        );

        return saved;
    }

    // 🔹 Creación manual desde Swagger
    public Account createAccount(Account account) {
        if (account.getAlias() == null || account.getAlias().isBlank()) {
            account.setAlias(Generators.generateAlias());
        }
        if (account.getCvu() == null || account.getCvu().isBlank()) {
            account.setCvu(Generators.generateCvu());
        }
        if (account.getSaldoDisponible() == null) {
            account.setSaldoDisponible(0.0);
        }

        return accountRepository.save(account);
    }

    public Account getByUserId(Long userId) {
        return accountRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Cuenta no encontrada para el usuario: " + userId));
    }

    public AccountDTO getAccountById(Long id) {
        Account acc = accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cuenta no encontrada: " + id));

        return AccountDTO.builder()
                .id(acc.getId())
                .userId(acc.getUserId())
                .cvu(acc.getCvu())
                .alias(acc.getAlias())
                .saldoDisponible(acc.getSaldoDisponible())
                .build();
    }

    public AccountDTO updateAccount(Long id, Map<String, Object> updates) {

        Account acc = accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cuenta no encontrada: " + id));

        // 🔹 Actualizar alias
        if (updates.containsKey("alias")) {
            Object aliasObj = updates.get("alias");
            if (aliasObj != null) {
                acc.setAlias(aliasObj.toString());
            }
        }

        // 🔹 Actualizar saldo disponible
        if (updates.containsKey("saldoDisponible")) {
            Object saldoObj = updates.get("saldoDisponible");
            if (saldoObj != null) {
                acc.setSaldoDisponible(Double.valueOf(saldoObj.toString()));
            }
        }

        Account saved = accountRepository.save(acc);

        return AccountDTO.builder()
                .id(saved.getId())
                .userId(saved.getUserId())
                .cvu(saved.getCvu())
                .alias(saved.getAlias())
                .saldoDisponible(saved.getSaldoDisponible())
                .build();
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    // Cargar saldo (depósito)
    public AccountDTO deposit(Long accountId, Double amount, String description) {

        if (amount == null || amount <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser mayor a 0");
        }

        Account acc = accountRepository.findById(accountId)
                .orElseThrow(() -> new RuntimeException("Cuenta no encontrada: " + accountId));

        // sumar saldo
        acc.setSaldoDisponible(acc.getSaldoDisponible() + amount);
        Account saved = accountRepository.save(acc);

        // registrar transacción positiva
        transactionService.registerTransaction(
                saved.getId(),
                amount,
                description != null ? description : "Carga de saldo"
        );

        return AccountDTO.builder()
                .id(saved.getId())
                .userId(saved.getUserId())
                .cvu(saved.getCvu())
                .alias(saved.getAlias())
                .saldoDisponible(saved.getSaldoDisponible())
                .build();
    }

    // Debitar saldo (pago, envío, etc.)
    public AccountDTO debit(Long accountId, Double amount, String description) {

        if (amount == null || amount <= 0) {
            throw new IllegalArgumentException("El monto a debitar debe ser mayor a 0");
        }

        Account acc = accountRepository.findById(accountId)
                .orElseThrow(() -> new RuntimeException("Cuenta no encontrada: " + accountId));

        // ❗ Validación de saldo negativo
        if (acc.getSaldoDisponible() < amount) {
            throw new RuntimeException("Saldo insuficiente");
        }

        // restar saldo
        acc.setSaldoDisponible(acc.getSaldoDisponible() - amount);
        Account saved = accountRepository.save(acc);

        // registrar transacción negativa
        transactionService.registerTransaction(
                saved.getId(),
                -amount,
                description != null ? description : "Débito en cuenta"
        );

        return AccountDTO.builder()
                .id(saved.getId())
                .userId(saved.getUserId())
                .cvu(saved.getCvu())
                .alias(saved.getAlias())
                .saldoDisponible(saved.getSaldoDisponible())
                .build();
    }

}
