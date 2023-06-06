package com.robloxhackerman.subme.dto;

import com.robloxhackerman.subme.entity.SubscriptionCard;

import java.util.Date;

public class SubscriptionDTO {
    private Long subscriptionId;
    private String subscriptionName;
    private Float subscriptionPrice;
    private Date subscriptionEnd;
    private SubscriptionCard subscriptionOwner;

    public SubscriptionDTO() {
    }

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
