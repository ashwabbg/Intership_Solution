package com.example.intership_solution.repository;

import com.example.intership_solution.model.Internship;
import com.example.intership_solution.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InternshipRepository extends JpaRepository<Internship, Integer>{
    List<Internship> findAllByStudent_StudentId(Integer studentId);
}