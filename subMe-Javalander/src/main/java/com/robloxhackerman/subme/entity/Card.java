package com.robloxhackerman.subme.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "card", uniqueConstraints = @UniqueConstraint(columnNames = "number"))
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long cardId;
    @Column(name = "number", nullable = false, length = 16)
    private Long cardNumber;
    @Column(name = "expire_month", length = 2)
    private Integer cardExpireMonth;
    @Column(name = "expire_year", length = 2)
    private Integer cardExpireYear;
    @Column(name = "subscriptions")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subscriptionOwner", orphanRemoval = true)
    private Set<Subscription> cardSubscriptions = new HashSet<>();
    @ManyToOne(fetch = FetchType.LAZY)
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

    public Integer getCardExpireMonth() {
        return cardExpireMonth;
    }

    public void setCardExpireMonth(Integer cardExpireMonth) {
        this.cardExpireMonth = cardExpireMonth;
    }

    public Integer getCardExpireYear() {
        return cardExpireYear;
    }

    public void setCardExpireYear(Integer cardExpireYear) {
        this.cardExpireYear = cardExpireYear;
    }

    public Set<Subscription> getCardSubscriptions() {
        return cardSubscriptions;
    }

    public void setCardSubscriptions(Set<Subscription> cardSubscriptions) {
        this.cardSubscriptions = cardSubscriptions;
    }

    public User getCardUser() {
        return cardUser;
    }

    public void setCardUser(User cardUser) {
        this.cardUser = cardUser;
    }
}
