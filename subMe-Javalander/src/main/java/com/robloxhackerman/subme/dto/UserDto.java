package com.robloxhackerman.subme.dto;

import com.robloxhackerman.subme.entity.Card;
import jakarta.validation.constraints.Size;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class UserDto {
    private UUID userId;
    private String userName;
    private String userEmail;
    @Size(min = 8, message = "La contraseña debe contener al menos 8 caracteres")
    private String userPassword;
    private Set<Card> userSubscription = new HashSet<>();
    private Set<String> roles;


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

    public Set<Card> getUserSubscription() {
        return userSubscription;
    }

    public void setUserSubscription(Set<Card> userSubscription) {
        this.userSubscription = userSubscription;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}
