package com.example.digital_payment_molina.users_service.repository;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Repository
public class TokenBlacklistRepository {

    private final Set<String> blacklistedTokens = Collections.synchronizedSet(new HashSet<>());

    public void invalidateToken(String token) {
        blacklistedTokens.add(token);
    }

    public boolean isTokenValid(String token) {
        return !blacklistedTokens.contains(token);
    }

}
