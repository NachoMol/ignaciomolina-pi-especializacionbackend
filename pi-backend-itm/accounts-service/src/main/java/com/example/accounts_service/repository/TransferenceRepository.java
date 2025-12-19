package com.example.accounts_service.repository;

import com.example.accounts_service.model.Transference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransferenceRepository extends JpaRepository<Transference, Long> {

    List<Transference> findTop5ByOriginAccountIdOrderByCreatedAtDesc(Long originAccountId);
}

