package com.example.accounts_service.service;

import com.example.accounts_service.dto.CardDTO;
import com.example.accounts_service.model.Card;
import com.example.accounts_service.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    private final CardRepository repo;

    public CardService(CardRepository repo) {
        this.repo = repo;
    }

    // Obtener todas las tarjetas de un usuario
    public List<CardDTO> getCards(Long accountId) {
        return repo.findByAccountId(accountId)
                .stream()
                .map(this::toDTO)
                .toList();
    }

    // Obtener una tarjeta específica
    public CardDTO getCard(Long accountId, Long cardId) {
        Card card = repo.findById(cardId)
                .filter(c -> c.getAccountId().equals(accountId))
                .orElseThrow(() -> new RuntimeException("Tarjeta no encontrada"));

        return toDTO(card);
    }

    // Crear tarjeta
    public CardDTO createCard(Long accountId, CardDTO dto) {

        // Validar duplicado por número de tarjeta
        repo.findByCardNumber(dto.getCardNumber())
                .ifPresent(c -> {
                    throw new RuntimeException("Tarjeta ya asociada a otra cuenta");
                });

        Card card = Card.builder()
                .accountId(accountId)
                .cardNumber(dto.getCardNumber())
                .holderName(dto.getHolderName())
                .expiration(dto.getExpiration())
                .type(dto.getType())
                .build();

        return toDTO(repo.save(card));
    }

    // Eliminar tarjeta
    public void deleteCard(Long accountId, Long cardId) {
        Card card = repo.findById(cardId)
                .filter(c -> c.getAccountId().equals(accountId))
                .orElseThrow(() -> new RuntimeException("Tarjeta no encontrada"));

        repo.delete(card);
    }

    // Mapper
    private CardDTO toDTO(Card c) {
        return CardDTO.builder()
                .id(c.getId())
                .accountId(c.getAccountId())
                .cardNumber(c.getCardNumber())
                .holderName(c.getHolderName())
                .expiration(c.getExpiration())
                .type(c.getType())
                .build();
    }
}
