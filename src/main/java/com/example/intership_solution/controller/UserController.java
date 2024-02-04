package com.example.intership_solution.controller;

import com.example.intership_solution.model.Credential;
import com.example.intership_solution.model.User;
import com.example.intership_solution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user) {
        userService.saveUser(user);
        return "New user is added";
    }

    @GetMapping("/getAll")
    public List<User> getAllInternships() { return userService.getAllUser();
    }

    @PostMapping(path = "/login")
    public User loginUser(@RequestBody Credential credential) {
        return userService.loginUser(credential.getPassword(), credential.getUsername());
    }
}
