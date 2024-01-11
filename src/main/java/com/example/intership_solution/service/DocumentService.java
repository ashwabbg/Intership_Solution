package com.example.intership_solution.service;

import com.example.intership_solution.model.Document;

import java.util.List;

public interface DocumentService {
    public Document saveDocument(Document document);
    public List<Document> getAllDocuments();
}