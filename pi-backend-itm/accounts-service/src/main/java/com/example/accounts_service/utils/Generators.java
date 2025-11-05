package com.example.accounts_service.utils;

import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

public class Generators {

    private static final Random random = new SecureRandom();
    private static List<String> aliasWords;

    static {
        try (var inputStream = new ClassPathResource("alias.txt").getInputStream()) {
            aliasWords = new BufferedReader(new InputStreamReader(inputStream))
                    .lines()
                    .toList();
            System.out.println("✅ alias.txt cargado correctamente con " + aliasWords.size() + " palabras.");
        } catch (Exception e) {
            System.err.println("⚠️ No se pudo cargar alias.txt: " + e.getMessage());
            aliasWords = List.of("cuenta", "simple", "random");
        }
    }

    // Generar CVU de 22 dígitos
    public static String generateCvu() {
        StringBuilder cvu = new StringBuilder();
        for (int i = 0; i < 22; i++) {
            cvu.append(random.nextInt(10));
        }
        return cvu.toString();
    }

    // Generar alias usando palabras del archivo o fallback
    public static String generateAlias() {
        if (aliasWords == null || aliasWords.isEmpty()) {
            System.err.println("⚠️ aliasWords está vacío, usando alias aleatorio simple");
            return "alias." + Long.toHexString(System.nanoTime());
        }

        int size = aliasWords.size();
        String part1 = aliasWords.get(random.nextInt(size));
        String part2 = aliasWords.get(random.nextInt(size));
        String part3 = aliasWords.get(random.nextInt(size));

        String alias = (part1 + "." + part2 + "." + part3).toLowerCase();
        System.out.println("🔹 Alias generado: " + alias);
        return alias;
    }
}
