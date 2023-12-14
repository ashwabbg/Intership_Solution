package com.example.intership_solution.service;

import com.example.intership_solution.model.Internship;
import java.util.List;

public interface InternshipService {
    public Internship saveInternship(Internship internship);
    public List<Internship> getAllInternships();
}