package com.pillowtalk.controller;

import com.pillowtalk.model.User;
import com.pillowtalk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/connected")
    public List<User> getConnectedUsers() {
        return userRepository.findByOnlineTrue();
    }
}
