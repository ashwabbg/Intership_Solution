package com.example.intership_solution.service;

import com.example.intership_solution.model.Internship;
import com.example.intership_solution.model.InternshipRequest;

import java.util.List;

public interface InternshipService {
    public void saveInternship(Internship internship);
    public List<Internship> getAllInternships();
    public Internship getInternshipByStudentID(InternshipRequest internshipRequest);
    public void removeInternship(Internship internship);
}