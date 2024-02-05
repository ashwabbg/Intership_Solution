package com.example.intership_solution.controller;

import com.example.intership_solution.model.Document;
import com.example.intership_solution.model.Internship;
import com.example.intership_solution.service.DocumentService;
import com.example.intership_solution.service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/document")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @PostMapping("/add")
    public String add(@RequestBody Document document) {
        documentService.saveDocument(document);
        return "New document is added";
    }

    @GetMapping("/getAll")
    public List<Document> getAllDocuments() {
        return documentService.getAllDocuments();
    }

    @GetMapping("/getByInternshipID/{id}")
    public  List<Document> getDocumentsFromInternshipId(@PathVariable int id){
        return documentService.getDocumentByInternship(id);
    }
}