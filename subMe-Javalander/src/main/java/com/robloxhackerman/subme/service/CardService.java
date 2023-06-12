package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.dto.CardDto;

import java.util.UUID;

public interface CardService {
    public CardDto addCard(UUID userId, CardDto cardDto);
    public void removeCard(Long cardNumber);
}
