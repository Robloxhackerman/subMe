package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.dto.DtoConverter;
import com.robloxhackerman.subme.dto.UserDTO;
import com.robloxhackerman.subme.entity.User;
import com.robloxhackerman.subme.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    private DtoConverter dtoConverter;

    @Override
    public UserDTO registerUser(UserDTO userDTO) {
        User user = dtoConverter.userToEntity(userDTO);
        User newUser = userRepository.save(user);

        return dtoConverter.userToDTO(newUser);
    }
}
