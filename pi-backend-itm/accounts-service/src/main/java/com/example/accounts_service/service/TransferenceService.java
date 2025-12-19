package com.example.accounts_service.service;

import com.example.accounts_service.dto.CreateTransferenceRequestDTO;
import com.example.accounts_service.dto.TransferenceDTO;
import com.example.accounts_service.model.Account;
import com.example.accounts_service.model.Transference;
import com.example.accounts_service.repository.AccountRepository;
import com.example.accounts_service.repository.TransferenceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransferenceService {

    private final AccountRepository accountRepository;
    private final TransferenceRepository transferenceRepository;
    private final TransactionService transactionService;

    public TransferenceService(AccountRepository accountRepository,
                               TransferenceRepository transferenceRepository,
                               TransactionService transactionService) {
        this.accountRepository = accountRepository;
        this.transferenceRepository = transferenceRepository;
        this.transactionService = transactionService;
    }

    public void createTransference(Long originAccountId, CreateTransferenceRequestDTO dto) {

        Account origin = accountRepository.findById(originAccountId)
                .orElseThrow(() -> new IllegalArgumentException("Cuenta inexistente"));

        Account destination = resolveDestination(dto);

        if (origin.getSaldoDisponible() < dto.getAmount()) {
            throw new IllegalStateException("Fondos insuficientes");
        }

        // 🔁 Impacto de saldo
        origin.setSaldoDisponible(origin.getSaldoDisponible() - dto.getAmount());
        destination.setSaldoDisponible(destination.getSaldoDisponible() + dto.getAmount());

        accountRepository.save(origin);
        accountRepository.save(destination);

        // 🧾 Registrar movimientos
        transactionService.registerTransaction(
                origin.getId(),
                -dto.getAmount(),
                "Transferencia a " + destination.getAlias()
        );

        transactionService.registerTransaction(
                destination.getId(),
                dto.getAmount(),
                "Transferencia recibida de cuenta #" + origin.getId()
        );

        // 🧠 Registrar transferencia
        transferenceRepository.save(
                Transference.builder()
                        .originAccountId(origin.getId())
                        .destinationAccountId(destination.getId())
                        .destinationAlias(destination.getAlias())
                        .destinationCvu(destination.getCvu())
                        .amount(dto.getAmount())
                        .createdAt(LocalDateTime.now())
                        .build()
        );
    }

    public List<TransferenceDTO> getLastTransferences(Long accountId) {
        return transferenceRepository
                .findTop5ByOriginAccountIdOrderByCreatedAtDesc(accountId)
                .stream()
                .map(t -> TransferenceDTO.builder()
                        .id(t.getId())
                        .amount(t.getAmount())
                        .destinationAlias(t.getDestinationAlias())
                        .destinationCvu(t.getDestinationCvu())
                        .createdAt(t.getCreatedAt())
                        .build())
                .toList();
    }

    private Account resolveDestination(CreateTransferenceRequestDTO dto) {

        if (dto.getAlias() != null) {
            return accountRepository.findByAlias(dto.getAlias())
                    .orElseThrow(() -> new IllegalArgumentException("Cuenta destino inexistente"));
        }

        if (dto.getCvu() != null) {
            return accountRepository.findByCvu(dto.getCvu())
                    .orElseThrow(() -> new IllegalArgumentException("Cuenta destino inexistente"));
        }

        throw new IllegalArgumentException("Debe informar alias o CVU");
    }
}

