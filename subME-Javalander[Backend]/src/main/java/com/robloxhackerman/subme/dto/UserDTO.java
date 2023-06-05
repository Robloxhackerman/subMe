package com.robloxhackerman.subme.dto;

import com.robloxhackerman.subme.entity.SubscrictionCard;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

public class UserDTO {
    private UUID userId;
    private String UserName;
    private String userEmail;
    private String userPassword;
    private List<SubscrictionCard> userSubscription;

    public UserDTO() {
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
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

    public List<SubscrictionCard> getUserSubscription() {
        return userSubscription;
    }

    public void setUserSubscription(List<SubscrictionCard> userSubscription) {
        this.userSubscription = userSubscription;
    }
}
