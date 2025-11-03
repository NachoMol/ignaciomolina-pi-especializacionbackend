package com.example.accounts_service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 22, nullable = false)
    private String cvu;

    @Column(unique = true, nullable = false)
    private String alias;

    @Column(nullable = false)
    private Double saldoDisponible = 0.0;

    @Column(nullable = false)
    private Long userId; // referencia externa al users-service
}
