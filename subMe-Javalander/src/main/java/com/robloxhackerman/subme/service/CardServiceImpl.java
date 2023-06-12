package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.dto.CardDto;
import com.robloxhackerman.subme.utilities.DtoConverter;
import com.robloxhackerman.subme.entity.Card;
import com.robloxhackerman.subme.entity.User;
import com.robloxhackerman.subme.exception.UserNotFoundException;
import com.robloxhackerman.subme.repository.CardRepository;
import com.robloxhackerman.subme.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;
    @Autowired
    private DtoConverter dtoConverter;
    @Autowired
    private UserRepository userRepository;

    @Override
    public CardDto addCard(UUID userId, CardDto cardDto) {
        Card card = dtoConverter.cardToEntity(cardDto);
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User", "id", userId));

        card.setCardUser(user);
        Card newCard = cardRepository.save(card);

        return dtoConverter.cardToDTO(newCard);
    }

    @Override
    public void removeCard(Long cardNumber) {
        cardRepository.removeCardByCardNumber(cardNumber);
    }
}
