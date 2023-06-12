package com.robloxhackerman.subme.repository;

import com.robloxhackerman.subme.dto.SubscriptionDto;
import com.robloxhackerman.subme.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    public SubscriptionDto findBySubscriptionName(String subName);
}
