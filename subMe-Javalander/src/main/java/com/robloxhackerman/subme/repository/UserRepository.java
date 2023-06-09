package com.robloxhackerman.subme.repository;

import com.robloxhackerman.subme.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    public User findUserByUserEmail(String username);
    public Boolean existsByUserEmail(String username);

}
