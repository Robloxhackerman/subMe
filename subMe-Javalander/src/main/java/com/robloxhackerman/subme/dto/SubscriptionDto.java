package com.robloxhackerman.subme.dto;

import com.robloxhackerman.subme.entity.Card;

public class SubscriptionDto {
    private Long subscriptionId;
    private String subscriptionName;
    private Float subscriptionPrice;
    private String subscriptionDay;
    private Card subscriptionOwner;

    public Long getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(Long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public Float getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setSubscriptionPrice(Float subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }

    public String getSubscriptionDay() {
        return subscriptionDay;
    }

    public void setSubscriptionDay(String subscriptionDay) {
        this.subscriptionDay = subscriptionDay;
    }

    public Card getSubscriptionOwner() {
        return subscriptionOwner;
    }

    public void setSubscriptionOwner(Card subscriptionOwner) {
        this.subscriptionOwner = subscriptionOwner;
    }
}
