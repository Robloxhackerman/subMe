package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.dto.SubscriptionDto;

public interface SubscriptionService {
    public SubscriptionDto addSubscription(Long id, SubscriptionDto subscriptionDto);
    public SubscriptionDto findSubscriptionByName(String subName);
    public void deleteSubscription(Long id);
}
