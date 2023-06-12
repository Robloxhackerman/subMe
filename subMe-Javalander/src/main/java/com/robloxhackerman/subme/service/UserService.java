package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.dto.UserDto;

import java.util.List;
import java.util.UUID;

public interface UserService {
    public UserDto createUser(UserDto userDto);

    public UserDto findUserByUsername(String userEmail);

    public UserDto findById(UUID id);
    public List<UserDto> findAll();

    public void deleteUser(UUID id);


}
