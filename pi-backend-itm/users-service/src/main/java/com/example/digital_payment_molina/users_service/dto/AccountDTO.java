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

    private Long userId;             // ID del usuario (viene del users-service)
    private String cvu;              // opcional: puede generarse del lado del accounts-service
    private String alias;            // opcional: idem arriba
    private Double saldoDisponible;  // saldo inicial (por defecto 0.0)
}
