package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.dto.SubscriptionDto;
import com.robloxhackerman.subme.entity.Subscription;
import com.robloxhackerman.subme.repository.CardRepository;
import com.robloxhackerman.subme.repository.SubscriptionRepository;
import com.robloxhackerman.subme.utilities.DtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;
    @Autowired
    private DtoConverter dtoConverter;
    @Autowired
    private CardRepository cardRepository;

    @Override
    public SubscriptionDto addSubscription(Long id, SubscriptionDto subscriptionDto) {
        Subscription subscription = dtoConverter.subscriptionToEntity(subscriptionDto);
        Subscription newSubscription = subscriptionRepository.save(subscription);

        return dtoConverter.subscriptionToDTO(newSubscription);
    }

    @Override
    public SubscriptionDto findSubscriptionByName(String subName) {
        return null;
    }

    @Override
    public void deleteSubscription(Long id) {

    }
}
