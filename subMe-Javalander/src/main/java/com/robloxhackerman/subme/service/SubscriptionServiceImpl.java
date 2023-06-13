package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.dto.SubscriptionDto;
import com.robloxhackerman.subme.entity.Card;
import com.robloxhackerman.subme.entity.Subscription;
import com.robloxhackerman.subme.exception.ResourceNotFoundException;
import com.robloxhackerman.subme.pagination.SubscriptionResponse;
import com.robloxhackerman.subme.repository.CardRepository;
import com.robloxhackerman.subme.repository.SubscriptionRepository;
import com.robloxhackerman.subme.utilities.DtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        Card card = cardRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Card", "id", id.toString()));

        Double cardDebt = card.getCardDebt();
        Double subPrice = subscription.getSubscriptionPrice();
        Double rounded = Math.round((cardDebt + subPrice)*100.0)/100.0;
        card.setCardDebt(rounded);

        subscription.setSubscriptionOwner(card);
        Subscription newSubscription = subscriptionRepository.save(subscription);


        return dtoConverter.subscriptionToDTO(newSubscription);
    }

    @Override
    public SubscriptionResponse findAllSubscriptions(Integer pageNum, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        Page<Subscription> subscriptions = subscriptionRepository.findAll(pageable);
        List<Subscription> subscriptionList = subscriptions.getContent();
        List<SubscriptionDto> subscriptionDtoList = subscriptionList
                .stream()
                .map(subscription -> dtoConverter
                        .subscriptionToDTO(subscription))
                .collect(Collectors.toList());

        SubscriptionResponse subscriptionResponse = new SubscriptionResponse();
        subscriptionResponse.setContent(subscriptionDtoList);
        subscriptionResponse.setPageNum(subscriptions.getNumber());
        subscriptionResponse.setPageSize(subscriptions.getSize());
        subscriptionResponse.setTotalPages(subscriptions.getTotalPages());
        subscriptionResponse.setTotalElements(subscriptions.getTotalElements());
        subscriptionResponse.setLastPage(subscriptions.isLast());

        return subscriptionResponse;
    }

    @Override
    public SubscriptionDto findSubscriptionByName(String subName) {
        return null;
    }

    @Override
    public void deleteSubscription(Long id) {

    }
}
