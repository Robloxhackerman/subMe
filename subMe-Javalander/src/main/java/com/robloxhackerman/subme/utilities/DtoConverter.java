package com.robloxhackerman.subme.utilities;

import com.robloxhackerman.subme.dto.CardDto;
import com.robloxhackerman.subme.dto.SubscriptionDto;
import com.robloxhackerman.subme.dto.UserDto;
import com.robloxhackerman.subme.entity.Card;
import com.robloxhackerman.subme.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.robloxhackerman.subme.entity.Subscription;

@Service
public class DtoConverter {


    @Autowired
    private ModelMapper modelMapper;


    ///User
    public User userToEntity(UserDto userDTO) {
        return modelMapper.map(userDTO, User.class);
    }

    public UserDto userToDTO(User user) {
        return modelMapper.map(user, UserDto.class);
    }


    ///Cards
    public Card cardToEntity(CardDto cardDto) {
        return modelMapper.map(cardDto, Card.class);
    }

    public CardDto cardToDTO(Card card) {
        return modelMapper.map(card, CardDto.class);
    }


    ///Subscriptions
    public Subscription subscriptionToEntity(SubscriptionDto subscriptionDTO) {
        return modelMapper.map(subscriptionDTO, Subscription.class);
    }

    public SubscriptionDto subscriptionToDTO(Subscription subscription) {
        return modelMapper.map(subscription, SubscriptionDto.class);
    }

}