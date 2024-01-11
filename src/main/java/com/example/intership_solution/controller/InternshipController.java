package com.example.intership_solution.controller;

import com.example.intership_solution.model.Internship;
import com.example.intership_solution.service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/internship")
public class InternshipController {

    @Autowired
    private InternshipService internshipService;

    @PostMapping("/add")
    public String add(@RequestBody Internship internship) {
        internshipService.saveInternship(internship);
        return "New internship is added";
    }

    @GetMapping("/getAll")
    public List<Internship> getAllInternships() {
        return internshipService.getAllInternships();
    }

    @GetMapping("/remove")
    public void remove(@RequestBody Internship internship){
        internshipService.removeInternship(internship);
    }
}