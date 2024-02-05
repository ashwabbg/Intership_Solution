package com.example.intership_solution.service;

import com.example.intership_solution.model.Document;
import com.example.intership_solution.model.Internship;

import javax.print.Doc;
import java.util.List;

public interface DocumentService {
    public Document saveDocument(Document document);
    public List<Document> getAllDocuments();
    public List<Document> getDocumentByInternship(Integer id);
}