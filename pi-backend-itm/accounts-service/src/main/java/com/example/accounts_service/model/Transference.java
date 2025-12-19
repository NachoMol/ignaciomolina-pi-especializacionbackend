package com.example.accounts_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@Table(name = "transferences")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long originAccountId;

    @Column(nullable = false)
    private Long destinationAccountId;

    @Column(nullable = false)
    private String destinationAlias;

    @Column(nullable = false)
    private String destinationCvu;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private LocalDateTime createdAt;
}

