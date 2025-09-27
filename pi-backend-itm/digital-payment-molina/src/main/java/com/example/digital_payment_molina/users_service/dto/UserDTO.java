package com.example.digital_payment_molina.users_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {

    private Long id;
    private String nyap;
    private String dni;
    private String email;
    private String telefono;
    private String cvu;
    private String alias;
}
