package com.robloxhackerman.subme.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;
    @Column(name = "username", nullable = false)
    private String userName;
    @Column(name = "email", nullable = false)
    private String userEmail;
    @Column(name = "password", nullable = false)
    private String userPassword;
    @Column(name = "suscriptions", nullable = true)
    @OneToMany(fetch = FetchType.LAZY)
    private List<SubscriptionCard> userSubscription;

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
