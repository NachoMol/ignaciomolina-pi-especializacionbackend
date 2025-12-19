package com.example.accounts_service.dto;

import lombok.Data;

@Data
public class CreateTransferenceRequestDTO {
    private Double amount;
    private String alias;
    private String cvu;
}