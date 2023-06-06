package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.dto.UserDTO;
import com.robloxhackerman.subme.entity.User;
import com.robloxhackerman.subme.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    public User DTOToEntity(UserDTO userDTO) {
        User user = new User();

        user.setUserId(userDTO.getUserId());
        user.setUserEmail(userDTO.getUserEmail());
        user.setUserName(userDTO.getUserName());
        user.setUserPassword(userDTO.getUserPassword());
        user.setUserSubscription(userDTO.getUserSubscription());

        return user;
    }

    public UserDTO entityToDTO(User user) {
        UserDTO userDTO = new UserDTO();

        userDTO.setUserId(user.getUserId());
        userDTO.setUserEmail(user.getUserEmail());
        userDTO.setUserName(user.getUserName());
        userDTO.setUserPassword(user.getUserPassword());
        userDTO.setUserSubscription(user.getUserSubscription());

        return userDTO;
    }
    @Override
    public UserDTO registerUser(UserDTO userDTO) {
        User user = DTOToEntity(userDTO);
        User newUser = userRepository.save(user);

        return entityToDTO(newUser);
    }
}
