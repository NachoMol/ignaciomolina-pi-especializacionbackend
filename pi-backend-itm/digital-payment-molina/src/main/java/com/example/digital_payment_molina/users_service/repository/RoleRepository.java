package com.example.digital_payment_molina.users_service.repository;

import com.example.digital_payment_molina.users_service.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
