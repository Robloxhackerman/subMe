package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.entity.User;
import com.robloxhackerman.subme.entity.UserRole;
import com.robloxhackerman.subme.exception.ResourceAlreadyExistsException;
import com.robloxhackerman.subme.repository.RoleRepository;
import com.robloxhackerman.subme.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) {
        User newUser = userRepository.findByUserName(user.getUserEmail());

        if (newUser != null) {
            throw new ResourceAlreadyExistsException("User", "email", user.getUserEmail());
        } else {
            for (UserRole userRole : userRoles) {
                roleRepository.save(userRole.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            newUser = userRepository.save(user);
        }
        return newUser;
    }

    @Override
    public Optional<User> findUserByUsername(UUID id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }
}
