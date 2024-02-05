package com.example.intership_solution.service;

import com.example.intership_solution.model.Internship;
import com.example.intership_solution.model.InternshipRequest;

import java.util.List;

public interface InternshipService {
    public void saveInternship(Internship internship);
    public List<Internship> getAllInternships();
    public List<Internship> getInternshipsByStudentID(int student_id);
    public void removeInternshipById(int id);
}