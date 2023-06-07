package com.robloxhackerman.subme.controller;

import com.robloxhackerman.subme.entity.Role;
import com.robloxhackerman.subme.entity.User;
import com.robloxhackerman.subme.entity.UserRole;
import com.robloxhackerman.subme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        Set<UserRole> userRoles = new HashSet<>();

        Role role = new Role();
        role.setRoleId(1L);
        role.setRoleName("Normal");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        return userService.createUser(user, userRoles);
    }

    @GetMapping("/{username}")
    public Optional<User> findUserByUsername(@PathVariable(name = "username") UUID id) {
        return userService.findUserByUsername(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable(name = "id") UUID id) {
        userService.deleteUser(id);
    }
}
