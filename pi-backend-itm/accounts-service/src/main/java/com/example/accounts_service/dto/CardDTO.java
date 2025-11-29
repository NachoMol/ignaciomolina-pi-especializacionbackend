package com.example.accounts_service.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {
    private Long id;
    private Long accountId;
    private String cardNumber;
    private String holderName;
    private String expiration;
    private String type;
}