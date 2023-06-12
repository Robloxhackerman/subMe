package com.robloxhackerman.subme.repository;

import com.robloxhackerman.subme.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    public Card removeCardByCardNumber(Long cardNumber);
}
