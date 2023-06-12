package com.robloxhackerman.subme.controller;

import com.robloxhackerman.subme.dto.SubscriptionDto;
import com.robloxhackerman.subme.pagination.SubscriptionResponse;
import com.robloxhackerman.subme.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @PostMapping("/users/cards/{cardId}/subscriptions")
    public ResponseEntity<SubscriptionDto> addSubscription(
            @PathVariable(name = "cardId") Long cardId,
            @RequestBody SubscriptionDto subscriptionDto) {
        return new ResponseEntity<>(subscriptionService.addSubscription(cardId, subscriptionDto), HttpStatus.CREATED);
    }

    @GetMapping("/users/cards/subscriptions")
    public SubscriptionResponse findAllSubscriptions(
            @RequestParam(value = "pageNum", required = false, defaultValue = "0") Integer pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize) {
        return subscriptionService.findAllSubscriptions(pageNum, pageSize);
    }
}
