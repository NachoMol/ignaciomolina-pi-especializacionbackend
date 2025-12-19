package com.example.accounts_service.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class TransferenceDTO {
    private Long id;
    private Double amount;
    private String destinationAlias;
    private String destinationCvu;
    private LocalDateTime createdAt;
}