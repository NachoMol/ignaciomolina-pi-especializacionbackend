package com.example.digital_payment_molina.users_service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "users")
@Getter @Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nyap;

    @NotBlank
    private String dni;

    @Email
    @Column(unique = true)
    private String email;

    private String telefono;

    private String password; // guardada encriptada

    @Column(unique = true, length = 22)
    private String cvu;

    @Column(unique = true)
    private String alias;



}
