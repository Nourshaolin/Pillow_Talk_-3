package com.pillowtalk.controller;

import com.pillowtalk.model.User;
import com.pillowtalk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public User login(@RequestBody User loginRequest) {
        return userRepository.findByUsername(loginRequest.getUsername())
                .filter(u -> u.getPassword().equals(loginRequest.getPassword()))
                .map(u -> {
                    u.setOnline(true);
                    userRepository.save(u);
                    return u;
                })
                .orElseThrow(() -> new RuntimeException("Invalid credentials"));
    }
}
