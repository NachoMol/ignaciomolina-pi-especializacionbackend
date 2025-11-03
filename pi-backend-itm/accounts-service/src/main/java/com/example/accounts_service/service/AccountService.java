package com.example.accounts_service.service;

import com.example.accounts_service.dto.AccountDTO;
import com.example.accounts_service.model.Account;
import com.example.accounts_service.repository.AccountRepository;
import com.example.accounts_service.utils.Generators;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // 🔹 Nuevo método: creación desde DTO (para llamadas desde users-service)
    public Account createAccountFromDTO(AccountDTO dto) {
        Account account = Account.builder()
                .userId(dto.getUserId())
                .saldoDisponible(dto.getSaldoDisponible() != null ? dto.getSaldoDisponible() : 0.0)
                .alias(Generators.generateAlias())
                .cvu(Generators.generateCvu())
                .build();

        return accountRepository.save(account);
    }

    // 🔹 Método manual (por si se crea desde Swagger, por ejemplo)
    public Account createAccount(Account account) {
        // Si no viene alias o cvu, los genera también
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

    public List<Account> findAll() {
        return accountRepository.findAll();
    }
}
