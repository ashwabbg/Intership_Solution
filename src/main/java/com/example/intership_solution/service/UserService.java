package com.example.intership_solution.service;

import com.example.intership_solution.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUser();
}
