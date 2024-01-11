package com.example.intership_solution.service;

import com.example.intership_solution.model.Internship;
import com.example.intership_solution.model.Student;
import com.example.intership_solution.repository.InternshipRepository;
import com.example.intership_solution.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private InternshipService internshipService;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void removeInternshipFromStudent(Student student, Internship internship) {
        if(student.getInternships().contains(internship)){
            internshipService.removeInternship(internship);
        }
    }
}
