package com.robloxhackerman.subme.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "card", uniqueConstraints = @UniqueConstraint(columnNames = "number"))
public class SubscriptionCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long cardId;
    @Column(name = "number", nullable = false, length = 16)
    private Long cardNumber;
    @Column(name = "expire", nullable = false)
    private Date cardDeath;
    @OneToMany
    @Column(name = "subscriptions", nullable = false)
    private List<Subscription> cardSubscriptions;
    @ManyToOne
    @JoinColumn(name = "card_user", nullable = false)
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
