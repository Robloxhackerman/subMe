package com.robloxhackerman.subme.dto;

import com.robloxhackerman.subme.entity.Subscription;
import com.robloxhackerman.subme.entity.User;

import java.util.Date;
import java.util.List;

public class SubscriptionCardDTO {
    private Long cardId;
    private Long cardNumber;
    private Date cardDeath;
    private List<Subscription> cardSubscriptions;
    private User cardUser;

    public SubscriptionCardDTO() {
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getCardDeath() {
        return cardDeath;
    }

    public void setCardDeath(Date cardDeath) {
        this.cardDeath = cardDeath;
    }

    public List<Subscription> getCardSubscriptions() {
        return cardSubscriptions;
    }

    public void setCardSubscriptions(List<Subscription> cardSubscriptions) {
        this.cardSubscriptions = cardSubscriptions;
    }

    public User getCardUser() {
        return cardUser;
    }

    public void setCardUser(User cardUser) {
        this.cardUser = cardUser;
    }
}
