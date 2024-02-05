package com.example.intership_solution.service;

import com.example.intership_solution.model.Internship;
import com.example.intership_solution.model.InternshipRequest;
import com.example.intership_solution.repository.InternshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipServiceImplementation implements InternshipService {

    @Autowired
    private InternshipRepository internshipRepository;

    @Override
    public void saveInternship(Internship internship) {
        internshipRepository.save(internship);
    }

    @Override
    public List<Internship> getAllInternships() {
        return internshipRepository.findAll();
    }

    @Override
    public List<Internship> getInternshipsByStudentID(int student_id) {
        List<Internship> internships = internshipRepository.findAllByStudent_StudentId(student_id);

        if(!internships.isEmpty()){
            return internships;
        }else{
            return null;
        }
    }
    @Override
    public void removeInternship(Internship internship) {
        internshipRepository.delete(internship);
    }
}