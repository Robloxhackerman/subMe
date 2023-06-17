package com.robloxhackerman.subme.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

@Entity
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subscriptionId;
    private String subscriptionName;
    private Double subscriptionPrice;
    private Integer subscriptionDay;
    private Integer subscriptionMonth;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "card_sub", nullable = false)
    @JsonBackReference
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

    public Double getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setSubscriptionPrice(Double subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }

    public Integer getSubscriptionDay() {
        return subscriptionDay;
    }

    public void setSubscriptionDay(Integer subscriptionDay) {
        this.subscriptionDay = subscriptionDay;
    }

    public Integer getSubscriptionMonth() {
        return subscriptionMonth;
    }

    public void setSubscriptionMonth(Integer subscriptionMonth) {
        this.subscriptionMonth = subscriptionMonth;
    }

    public Card getSubscriptionOwner() {
        return subscriptionOwner;
    }

    public void setSubscriptionOwner(Card subscriptionOwner) {
        this.subscriptionOwner = subscriptionOwner;
    }
}
