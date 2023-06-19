package com.robloxhackerman.subme.controller;

import com.robloxhackerman.subme.controller.response.MessageResponse;
import com.robloxhackerman.subme.dto.UserDto;
import com.robloxhackerman.subme.repository.UserRepository;
import com.robloxhackerman.subme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody UserDto userDto) {

        if (userRepository.existsByUserEmail(userDto.getUserEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Email is already in use!"));
        }


        userService.createUser(userDto);

        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }
}
