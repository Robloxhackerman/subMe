package com.robloxhackerman.subme.service;

import com.robloxhackerman.subme.entity.EnumRole;
import com.robloxhackerman.subme.entity.Role;
import com.robloxhackerman.subme.repository.RoleRepository;
import com.robloxhackerman.subme.utilities.DtoConverter;
import com.robloxhackerman.subme.dto.UserDto;
import com.robloxhackerman.subme.entity.User;
import com.robloxhackerman.subme.exception.ResourceNotFoundException;
import com.robloxhackerman.subme.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DtoConverter dtoConverter;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    PasswordEncoder passwordEncoder;


    @Override
    public UserDto createUser(UserDto userDto) {

        Set<String> strRoles = userDto.getRoles();
        Set<Role> roles = new HashSet<>();

        if (strRoles == null) {
            Role userRole = roleRepository.findByName(EnumRole.USER)
                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
            roles.add(userRole);
        }

        User user = new User(userDto.getUserName(),
                userDto.getUserEmail(),
                passwordEncoder.encode(userDto.getUserPassword()));

        user.setRoles(roles);

        User newUser = userRepository.save(user);

        return dtoConverter.userToDTO(newUser);
    }

    @Override
    public UserDto findUserByUsername(String userEmail) {
        User user = userRepository.findUserByUserEmail(userEmail);
        return dtoConverter.userToDTO(user);
    }

    @Override
    public UserDto findById(UUID uuid) {
        User user = userRepository.findById(uuid)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", uuid.toString()));
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
    public UserDto updateUser(UserDto userDto, UUID uuid) {
        User user = userRepository.findById(uuid)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", uuid.toString()));

        user = dtoConverter.userToEntity(userDto);
        User newUser = userRepository.save(user);

        return dtoConverter.userToDTO(newUser);
    }

    @Override
    public void deleteUser(UUID uuid) {
        userRepository.deleteById(uuid);
    }
}
