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

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // ⭐ NUEVO - Método que usan users-service y tus tests
    public AccountDTO createAccount(AccountDTO dto) {
        Account saved = createAccountFromDTO(dto);

        return AccountDTO.builder()
                .userId(saved.getUserId())
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

        return accountRepository.save(account);
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

        if (updates.containsKey("alias")) {
            acc.setAlias(updates.get("alias").toString());
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
}
