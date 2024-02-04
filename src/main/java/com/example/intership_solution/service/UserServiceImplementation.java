package com.example.intership_solution.service;

import com.example.intership_solution.model.User;
import com.example.intership_solution.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser(){return userRepository.findAll();}

    @Override
    public User loginUser(String password, String username) {
        String[] parts = username.split("_");
        List<User> userList = userRepository.findByPasswordAndFirstnameAndLastname(password, parts[0], parts[1]);

        if(!userList.isEmpty()){
            return userList.get(0);
        }else{
            return null;
        }

    }

}
