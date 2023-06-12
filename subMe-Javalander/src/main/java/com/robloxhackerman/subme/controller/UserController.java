package com.robloxhackerman.subme.controller;

import com.robloxhackerman.subme.dto.UserDto;
import com.robloxhackerman.subme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users/")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userService.createUser(userDto), HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public List<UserDto> findAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/users/username/{username}")
    public ResponseEntity<UserDto> findUserbyUsername(@PathVariable(name = "username") String username) {
        return ResponseEntity.ok(userService.findUserByUsername(username));
    }

    @GetMapping("/users/id/{id}")
    public ResponseEntity<UserDto> findUserById(@PathVariable(name = "id") UUID id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable(name = "id") UUID id) {
        userService.deleteUser(id);
        return new ResponseEntity<>("Usuario eliminado", HttpStatus.OK);
    }
}
