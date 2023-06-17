package com.robloxhackerman.subme.dto;

import com.robloxhackerman.subme.entity.Subscription;
import com.robloxhackerman.subme.entity.User;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.HashSet;
import java.util.Set;

public class CardDto {
    private Long cardId;
    private Long cardNumber;
    private Integer cardExpireMonth;
    private Integer cardExpireYear;
    private Double cardDebt = 0.0;
    private Set<Subscription> cardSubscriptions = new HashSet<>();
    private User cardUser;

    public CardDto() {

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

    public Double getCardDebt() {
        return cardDebt;
    }

    public void setCardDebt(Double cardDebt) {
        this.cardDebt = cardDebt;
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
