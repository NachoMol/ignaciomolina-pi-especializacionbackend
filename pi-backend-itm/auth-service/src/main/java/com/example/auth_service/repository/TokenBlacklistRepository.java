package com.example.auth_service.repository;

import org.springframework.stereotype.Repository;
import java.util.HashSet;
import java.util.Set;

@Repository
public class TokenBlacklistRepository {

    private final Set<String> blacklist = new HashSet<>();

    public void invalidateToken(String token) {
        blacklist.add(token);
    }

    public boolean isTokenValid(String token) {
        return !blacklist.contains(token);
    }
}
