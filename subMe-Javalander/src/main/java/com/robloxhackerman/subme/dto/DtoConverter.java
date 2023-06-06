package com.robloxhackerman.subme.dto;

import com.robloxhackerman.subme.entity.Subscription;
import com.robloxhackerman.subme.entity.SubscriptionCard;
import com.robloxhackerman.subme.entity.User;

public class DtoConverter {

    ///User
    public User userToEntity(UserDTO userDTO) {
        User user = new User();

        user.setUserId(userDTO.getUserId());
        user.setUserEmail(userDTO.getUserEmail());
        user.setUserName(userDTO.getUserName());
        user.setUserPassword(userDTO.getUserPassword());
        user.setUserSubscription(userDTO.getUserSubscription());

        return user;
    }

    public UserDTO userToDTO(User user) {
        UserDTO userDTO = new UserDTO();

        userDTO.setUserId(user.getUserId());
        userDTO.setUserEmail(user.getUserEmail());
        userDTO.setUserName(user.getUserName());
        userDTO.setUserPassword(user.getUserPassword());
        userDTO.setUserSubscription(user.getUserSubscription());

        return userDTO;
    }


    ///Cards
    public SubscriptionCard cardToEntity(SubscriptionCardDTO subscriptionCardDTO) {
        SubscriptionCard subscriptionCard = new SubscriptionCard();

        subscriptionCard.setCardId(subscriptionCardDTO.getCardId());
        subscriptionCard.setCardNumber(subscriptionCardDTO.getCardNumber());
        subscriptionCard.setCardDeath(subscriptionCardDTO.getCardDeath());
        subscriptionCard.setCardUser(subscriptionCardDTO.getCardUser());
        subscriptionCard.setCardSubscriptions(subscriptionCardDTO.getCardSubscriptions());

        return subscriptionCard;
    }

    public SubscriptionCardDTO cardToDTO(SubscriptionCard subscriptionCard) {
        SubscriptionCardDTO subscriptionCardDTO = new SubscriptionCardDTO();

        subscriptionCardDTO.setCardId(subscriptionCard.getCardId());
        subscriptionCardDTO.setCardNumber(subscriptionCard.getCardNumber());
        subscriptionCardDTO.setCardDeath(subscriptionCard.getCardDeath());
        subscriptionCardDTO.setCardUser(subscriptionCard.getCardUser());
        subscriptionCardDTO.setCardSubscriptions(subscriptionCard.getCardSubscriptions());

        return subscriptionCardDTO;
    }

    ///Subscriptions
    public Subscription subscriptionToEntity(SubscriptionDTO subscriptionDTO) {
        Subscription subscription = new Subscription();

        subscription.setSubscriptionId(subscriptionDTO.getSubscriptionId());
        subscription.setSubscriptionName(subscriptionDTO.getSubscriptionName());
        subscription.setSubscriptionPrice(subscriptionDTO.getSubscriptionPrice());
        subscription.setSubscriptionEnd(subscriptionDTO.getSubscriptionEnd());
        subscription.setSubscriptionOwner(subscriptionDTO.getSubscriptionOwner());

        return subscription;
    }

    public SubscriptionDTO subscriptionToDTO(Subscription subscription) {
        SubscriptionDTO subscriptionDTO = new SubscriptionDTO();

        subscriptionDTO.setSubscriptionId(subscription.getSubscriptionId());
        subscriptionDTO.setSubscriptionName(subscription.getSubscriptionName());
        subscriptionDTO.setSubscriptionPrice(subscription.getSubscriptionPrice());
        subscriptionDTO.setSubscriptionEnd(subscription.getSubscriptionEnd());
        subscriptionDTO.setSubscriptionOwner(subscription.getSubscriptionOwner());

        return subscriptionDTO;
    }

}
