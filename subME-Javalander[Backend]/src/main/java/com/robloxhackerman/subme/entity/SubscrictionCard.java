package com.robloxhackerman.subme.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class SubscrictionCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;
    private Long cardNumber;
    private Date cardDeath;
    @OneToMany
    private List<Subscription> cardSubscriptions;
    @ManyToOne
    private User cardUser;

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
