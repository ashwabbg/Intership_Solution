package com.example.intership_solution.service;

import com.example.intership_solution.model.Internship;
import com.example.intership_solution.model.Student;
import com.example.intership_solution.repository.InternshipRepository;
import com.example.intership_solution.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Student getStudentByStudentID(int studentID) {
        Optional<Student> studentOptional = studentRepository.findById(studentID);
        return studentOptional.orElse(null);
    }

    @Override
    public void removeInternshipFromStudent(Student student, Internship internship) {
        if(student.getInternships().contains(internship)){
            internshipService.removeInternship(internship);
        }
    }
}
