package com.example.intership_solution.service;

import com.example.intership_solution.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}