package com.robloxhackerman.subme.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subscriptionId;
    private String subscriptionName;
    private Float subscriptionPrice;
    private Date subscriptionDay;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_sub", nullable = false)
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

    public Date getSubscriptionDay() {
        return subscriptionDay;
    }

    public void setSubscriptionDay(Date subscriptionDay) {
        this.subscriptionDay = subscriptionDay;
    }

    public Card getSubscriptionOwner() {
        return subscriptionOwner;
    }

    public void setSubscriptionOwner(Card subscriptionOwner) {
        this.subscriptionOwner = subscriptionOwner;
    }
}
