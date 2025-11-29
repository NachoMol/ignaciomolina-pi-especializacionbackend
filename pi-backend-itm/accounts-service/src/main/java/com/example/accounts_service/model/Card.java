package com.example.accounts_service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cards")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long accountId;  // asociada a qué cuenta

    @Column(nullable = false, unique = true, length = 16)
    private String cardNumber;

    @Column(nullable = false)
    private String holderName;

    @Column(nullable = false, length = 5)
    private String expiration; // formato MM/YY

    @Column(nullable = false)
    private String type; // "credito" o "debito"
}
