package com.example.digital_payment_molina.users_service.utils;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

public class Generators {

    private static final Random random = new SecureRandom();

    // Generar CVU de 22 dígitos
    public static String generateCvu() {
        StringBuilder cvu = new StringBuilder();
        for (int i = 0; i < 22; i++) {
            cvu.append(random.nextInt(10));
        }
        return cvu.toString();
    }

    // Generar alias a partir de una lista de palabras
    public static String generateAlias(List<String> words) {
        int size = words.size();
        String alias = words.get(random.nextInt(size)) + "." +
                words.get(random.nextInt(size)) + "." +
                words.get(random.nextInt(size));
        return alias.toLowerCase();
    }

}
