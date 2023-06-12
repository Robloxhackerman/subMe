package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.dto.CardDto;

import java.util.List;
import java.util.UUID;

public interface CardService {
    public CardDto addCard(UUID userId, CardDto cardDto);
    public CardDto findCardById(Long id);
    public List<CardDto> findAllCards();
    public void removeCard(Long cardNumber);
}
