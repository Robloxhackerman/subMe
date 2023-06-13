package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.utilities.DtoConverter;
import com.robloxhackerman.subme.dto.UserDto;
import com.robloxhackerman.subme.entity.User;
import com.robloxhackerman.subme.exception.ResourceNotFoundException;
import com.robloxhackerman.subme.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DtoConverter dtoConverter;


    @Override
    public UserDto createUser(UserDto userDto) {
        User user = dtoConverter.userToEntity(userDto);
        User newUser = userRepository.save(user);

        return dtoConverter.userToDTO(newUser);
    }

    @Override
    public UserDto findUserByUsername(String userEmail) {
        User user = userRepository.findUserByUserEmail(userEmail);
        return dtoConverter.userToDTO(user);
    }

    @Override
    public UserDto findById(UUID id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", id.toString()));
        return dtoConverter.userToDTO(user);
    }

    @Override
    public List<UserDto> findAll() {
        List<User> userList = userRepository.findAll();
        return userList
                .stream()
                .map(user -> dtoConverter.userToDTO(user))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }
}
