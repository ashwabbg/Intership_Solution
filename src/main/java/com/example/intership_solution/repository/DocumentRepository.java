package com.example.intership_solution.repository;

import com.example.intership_solution.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer>{
    public List<Document> findAllByInternship_InternshipId(Integer internshipId);
}