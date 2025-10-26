package com.example.digital_payment_molina.users_service.repository;

import com.example.digital_payment_molina.users_service.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void findByEmailShouldReturnUser() {
        // given
        User user = new User();
        user.setNyap("Test Test");
        user.setDni("12345678");
        user.setEmail("nacho@test.com");
        user.setPassword("1234");
        userRepository.save(user);

        // when
        Optional<User> result = userRepository.findByEmail("nacho@test.com");

        // then
        assertTrue(result.isPresent());
        assertEquals("nacho@test.com", result.get().getEmail());
    }

    @Test
    void existsByEmailShouldReturnTrue() {
        // given
        User user = new User();
        user.setNyap("Test Test");
        user.setEmail("existe@test.com");
        user.setDni("12345678");
        user.setPassword("1234");
        userRepository.save(user);

        // when
        boolean result = userRepository.existsByEmail("existe@test.com");

        // then
        assertTrue(result);
    }

    @Test
    void existsByEmailShouldReturnFalse() {
        // when
        boolean result = userRepository.existsByEmail("inexistente@test.com");

        // then
        assertFalse(result);
    }
}
