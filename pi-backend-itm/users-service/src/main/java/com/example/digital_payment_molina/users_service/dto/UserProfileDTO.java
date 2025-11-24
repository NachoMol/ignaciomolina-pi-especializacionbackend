package com.example.digital_payment_molina.users_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileDTO {

    private Long id;
    private String nyap;
    private String dni;
    private String email;
    private String telefono;

    private String cvu;
    private String alias;
    private Double saldoDisponible;
}
