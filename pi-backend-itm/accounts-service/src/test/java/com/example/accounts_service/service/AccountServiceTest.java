package com.example.accounts_service.service;

import com.example.accounts_service.dto.AccountDTO;
import com.example.accounts_service.model.Account;
import com.example.accounts_service.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountServiceTest {

    @MockBean
    private AccountRepository accountRepository;

    @Autowired
    private AccountService accountService;

    @Test
    void createAccountShouldSave() {
        AccountDTO dto = AccountDTO.builder()
                .userId(1L)
                .saldoDisponible(0.0)
                .build();

        Account saved = new Account();
        saved.setId(1L);
        saved.setUserId(1L);
        saved.setSaldoDisponible(0.0);

        Mockito.when(accountRepository.save(Mockito.any(Account.class)))
                .thenReturn(saved);

        AccountDTO result = accountService.createAccount(dto);

        assertNotNull(result);
        assertEquals(1L, result.getUserId());
        assertEquals(0.0, result.getSaldoDisponible());
    }
}

