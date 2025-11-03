package com.example.accounts_service.utils;

import java.util.Random;
import java.util.UUID;

public class Generators {

    public static String generateCvu() {
        StringBuilder cvu = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 22; i++) {
            cvu.append(random.nextInt(10));
        }
        return cvu.toString();
    }

    public static String generateAlias() {
        return "alias." + UUID.randomUUID().toString().substring(0, 8);
    }
}
