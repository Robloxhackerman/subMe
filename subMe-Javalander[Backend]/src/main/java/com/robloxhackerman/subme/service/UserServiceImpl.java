package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.dto.UserDTO;
import com.robloxhackerman.subme.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO registerUser(UserDTO userDTO) {
        return null;
    }
}
