package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.entity.User;
import com.robloxhackerman.subme.entity.UserRole;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface UserService {
    public User createUser(User userm, Set<UserRole> userRoles);

    public Optional<User> findUserByUsername(UUID id);

    public void deleteUser(UUID id);
}
