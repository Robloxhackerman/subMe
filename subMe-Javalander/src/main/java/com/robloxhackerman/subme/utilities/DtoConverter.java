package com.robloxhackerman.subme.utilities;

import com.robloxhackerman.subme.dto.CardDto;
import com.robloxhackerman.subme.dto.SubscriptionDto;
import com.robloxhackerman.subme.dto.UserDto;
import com.robloxhackerman.subme.entity.Card;
import com.robloxhackerman.subme.entity.User;
import org.springframework.stereotype.Service;
import com.robloxhackerman.subme.entity.Subscription;

@Service
public class DtoConverter {


    ///User
    public User userToEntity(UserDto userDTO) {
        User user = new User();

        user.setUserId(userDTO.getUserId());
        user.setUserEmail(userDTO.getUserEmail());
        user.setUserName(userDTO.getUserName());
        user.setUserPassword(userDTO.getUserPassword());
        user.setUserSubscription(userDTO.getUserSubscription());

        return user;
    }

    public UserDto userToDTO(User user) {
        UserDto userDTO = new UserDto();

        userDTO.setUserId(user.getUserId());
        userDTO.setUserEmail(user.getUserEmail());
        userDTO.setUserName(user.getUserName());
        userDTO.setUserPassword(user.getUserPassword());
        userDTO.setUserSubscription(user.getUserSubscription());

        return userDTO;
    }


    
    ///Cards
    public Card cardToEntity(CardDto cardDto) {
        Card card = new Card();

        card.setCardId(cardDto.getCardId());
        card.setCardNumber(cardDto.getCardNumber());
        card.setCardExpireMonth(cardDto.getCardExpireMonth());
        card.setCardExpireYear(cardDto.getCardExpireYear());
        card.setCardUser(cardDto.getCardUser());
        card.setCardSubscriptions(cardDto.getCardSubscriptions());

        return card;
    }

    public CardDto cardToDTO(Card card) {
        CardDto cardDto = new CardDto();

        cardDto.setCardId(card.getCardId());
        cardDto.setCardNumber(card.getCardNumber());
        cardDto.setCardExpireMonth(card.getCardExpireMonth());
        cardDto.setCardExpireYear(card.getCardExpireYear());
        cardDto.setCardUser(card.getCardUser());
        cardDto.setCardSubscriptions(card.getCardSubscriptions());

        return cardDto;
    }
    

    ///Subscriptions
    public Subscription subscriptionToEntity(SubscriptionDto subscriptionDTO) {
        Subscription subscription = new Subscription();

        subscription.setSubscriptionId(subscriptionDTO.getSubscriptionId());
        subscription.setSubscriptionName(subscriptionDTO.getSubscriptionName());
        subscription.setSubscriptionPrice(subscriptionDTO.getSubscriptionPrice());
        subscription.setSubscriptionDay(subscriptionDTO.getSubscriptionDay());
        subscription.setSubscriptionMonth(subscriptionDTO.getSubscriptionMonth());
        subscription.setSubscriptionOwner(subscriptionDTO.getSubscriptionOwner());

        return subscription;
    }

    public SubscriptionDto subscriptionToDTO(Subscription subscription) {
        SubscriptionDto subscriptionDTO = new SubscriptionDto();

        subscriptionDTO.setSubscriptionId(subscription.getSubscriptionId());
        subscriptionDTO.setSubscriptionName(subscription.getSubscriptionName());
        subscriptionDTO.setSubscriptionPrice(subscription.getSubscriptionPrice());
        subscriptionDTO.setSubscriptionDay(subscription.getSubscriptionDay());
        subscriptionDTO.setSubscriptionMonth(subscription.getSubscriptionMonth());
        subscriptionDTO.setSubscriptionOwner(subscription.getSubscriptionOwner());

        return subscriptionDTO;
    }
    
}