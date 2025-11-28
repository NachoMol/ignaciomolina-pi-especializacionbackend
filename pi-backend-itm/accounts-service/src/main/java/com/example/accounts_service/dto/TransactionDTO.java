package com.example.accounts_service.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {
    private Long id;
    private Long accountId;
    private Double amount;
    private String description;
    private LocalDateTime createdAt;
}
