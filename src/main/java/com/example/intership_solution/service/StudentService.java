package com.example.intership_solution.service;

import com.example.intership_solution.model.Internship;
import com.example.intership_solution.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentByStudentID(int studentID);
    public void removeInternshipFromStudent(Student student, Internship internship);
}
