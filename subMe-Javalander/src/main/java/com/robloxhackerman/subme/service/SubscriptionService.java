package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.dto.SubscriptionDto;
import com.robloxhackerman.subme.pagination.SubscriptionResponse;

import java.util.List;

public interface SubscriptionService {
    public SubscriptionDto addSubscription(Long id, SubscriptionDto subscriptionDto);
    public SubscriptionResponse findAllSubscriptions(Integer pageNum, Integer pageSize);
    public SubscriptionDto findSubscriptionByName(String subName);
    public void deleteSubscription(Long id);
}
