package com.robloxhackerman.subme.controller;

import com.robloxhackerman.subme.dto.UserDto;
import com.robloxhackerman.subme.service.UserService;
import jakarta.validation.Valid;
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

    @GetMapping("/users")
    public List<UserDto> findAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/users/username/{username}")
    public ResponseEntity<UserDto> findUserbyUsername(@PathVariable(name = "username") String username) {
        return ResponseEntity.ok(userService.findUserByUsername(username));
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserDto> findUserById(@PathVariable(name = "id") UUID uuid) {
        return ResponseEntity.ok(userService.findById(uuid));
    }
    @PutMapping("/user/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable(name = "id")UUID uuid,
                                              @RequestBody UserDto userDto){
        return new ResponseEntity<>(userService.updateUser(userDto, uuid),HttpStatus.OK);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable(name = "id") UUID uuid) {
        userService.deleteUser(uuid);
        return new ResponseEntity<>("Usuario eliminado", HttpStatus.OK);
    }
}
