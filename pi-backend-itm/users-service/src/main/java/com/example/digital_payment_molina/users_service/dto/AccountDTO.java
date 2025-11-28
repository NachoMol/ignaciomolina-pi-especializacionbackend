package com.example.digital_payment_molina.users_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {

    private Long id;
    private Long userId;
    private String cvu;
    private String alias;
    private Double saldoDisponible;
}

