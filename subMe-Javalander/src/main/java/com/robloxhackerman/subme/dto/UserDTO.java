package com.robloxhackerman.subme.dto;

import com.robloxhackerman.subme.entity.SubscriptionCard;

import java.util.List;
import java.util.UUID;

public class UserDTO {
    private UUID userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private List<SubscriptionCard> userSubscription;

    public UserDTO() {
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public List<SubscriptionCard> getUserSubscription() {
        return userSubscription;
    }

    public void setUserSubscription(List<SubscriptionCard> userSubscription) {
        this.userSubscription = userSubscription;
    }
}
