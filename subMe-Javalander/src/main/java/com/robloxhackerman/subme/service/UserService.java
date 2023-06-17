package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.dto.UserDto;

import java.util.List;
import java.util.UUID;

public interface UserService {
    public UserDto createUser(UserDto userDto);
    public UserDto findUserByUsername(String userEmail);
    public UserDto findById(UUID uuid);
    public List<UserDto> findAll();
    public UserDto updateUser(UserDto userDto, UUID uuid);
    public void deleteUser(UUID uuid);
}
