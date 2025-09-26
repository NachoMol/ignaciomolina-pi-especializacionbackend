package com.example.digital_payment_molina.users_service.repository;

import com.example.digital_payment_molina.users_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);



}
