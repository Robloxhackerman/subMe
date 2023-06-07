package com.robloxhackerman.subme.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SubscriptionCard> userSubscription;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
    @Column(name = "roles")
    private Set<UserRole> userRoles = new HashSet<>();

    public User() {
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

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
