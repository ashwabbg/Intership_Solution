package com.example.intership_solution.service;

import com.example.intership_solution.model.Internship;
import com.example.intership_solution.repository.InternshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipServiceImplementation implements InternshipService {

    @Autowired
    private InternshipRepository internshipRepository;

    @Override
    public Internship saveInternship(Internship internship) {
        return internshipRepository.save(internship);
    }

    @Override
    public List<Internship> getAllInternships() {
        return internshipRepository.findAll();
    }
}
