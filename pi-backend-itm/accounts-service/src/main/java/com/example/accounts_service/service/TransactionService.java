package com.example.accounts_service.service;

import com.example.accounts_service.dto.TransactionDTO;
import com.example.accounts_service.model.Transaction;
import com.example.accounts_service.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository repo;

    public TransactionService(TransactionRepository repo) {
        this.repo = repo;
    }

    public List<TransactionDTO> getLastTransactions(Long accountId) {
        return repo.findTop5ByAccountIdOrderByCreatedAtDesc(accountId)
                .stream()
                .map(t -> TransactionDTO.builder()
                        .id(t.getId())
                        .accountId(t.getAccountId())
                        .amount(t.getAmount())
                        .description(t.getDescription())
                        .createdAt(t.getCreatedAt())
                        .build())
                .toList();
    }

    public List<TransactionDTO> getAllTransactions(Long accountId) {
        return repo.findByAccountIdOrderByCreatedAtDesc(accountId)
                .stream()
                .map(t -> TransactionDTO.builder()
                        .id(t.getId())
                        .accountId(t.getAccountId())
                        .amount(t.getAmount())
                        .description(t.getDescription())
                        .createdAt(t.getCreatedAt())
                        .build())
                .toList();
    }

    public TransactionDTO getTransactionById(Long accountId, Long txId) {

        Transaction t = repo.findByIdAndAccountId(txId, accountId)
                .orElseThrow(() -> new RuntimeException("Transacción no encontrada"));

        return TransactionDTO.builder()
                .id(t.getId())
                .accountId(t.getAccountId())
                .amount(t.getAmount())
                .description(t.getDescription())
                .createdAt(t.getCreatedAt())
                .build();
    }


    public void registerTransaction(Long accountId, Double amount, String description) {
        Transaction t = Transaction.builder()
                .accountId(accountId)
                .amount(amount)
                .description(description)
                .createdAt(LocalDateTime.now())
                .build();

        repo.save(t);
    }


}
