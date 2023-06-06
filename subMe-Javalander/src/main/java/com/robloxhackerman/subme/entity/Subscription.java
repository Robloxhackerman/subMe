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
    private Date subscriptionEnd;
    @ManyToOne
    private SubscriptionCard subscriptionOwner;

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

    public Date getSubscriptionEnd() {
        return subscriptionEnd;
    }

    public void setSubscriptionEnd(Date subscriptionEnd) {
        this.subscriptionEnd = subscriptionEnd;
    }

    public SubscriptionCard getSubscriptionOwner() {
        return subscriptionOwner;
    }

    public void setSubscriptionOwner(SubscriptionCard subscriptionOwner) {
        this.subscriptionOwner = subscriptionOwner;
    }
}
