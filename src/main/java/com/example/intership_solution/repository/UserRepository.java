package com.example.intership_solution.repository;

import com.example.intership_solution.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByPasswordAndFirstnameAndLastname(String password, String first_name, String last_name);
}
