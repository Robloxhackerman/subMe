package com.robloxhackerman.subme.controller;

import com.robloxhackerman.subme.dto.CardDto;
import com.robloxhackerman.subme.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class CardController {

    @Autowired
    private CardService cardService;

    @PostMapping("/users/{userId}/cards")
    public ResponseEntity<CardDto> addCard(@PathVariable(name = "userId") UUID userId,
                                           @RequestBody CardDto cardDto) {
        return new ResponseEntity<>(cardService.addCard(userId, cardDto), HttpStatus.CREATED);
    }

    @GetMapping("/users/cards")
    public List<CardDto> findAllCards() {
        return cardService.findAllCards();
    }
}
