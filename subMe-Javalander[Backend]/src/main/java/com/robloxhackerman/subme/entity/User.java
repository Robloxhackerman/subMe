package com.robloxhackerman.subme.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false)
    private UUID userId;
    @Column(nullable = false)
    private String UserName;
    @Column(name = "email", nullable = false)
    private String userEmail;
    @Column(nullable = false)
    private String userPassword;
    @OneToMany(fetch = FetchType.LAZY)
    private List<SubscrictionCard> userSubscription;

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
