package com.example.intership_solution.controller;

import com.example.intership_solution.model.Internship;
import com.example.intership_solution.model.InternshipRequest;
import com.example.intership_solution.model.Student;
import com.example.intership_solution.service.InternshipService;
import com.example.intership_solution.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/internship")
public class InternshipController {

    @Autowired
    private InternshipService internshipService;

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody InternshipRequest internshipRequest) {
        Student student = studentService.getStudentByStudentID(internshipRequest.getStudentId());
        Internship internship = new Internship(internshipRequest.getTitle(),internshipRequest.getDate(),student,null);
        internshipService.saveInternship(internship);
        return "New internship is added";
    }

    @GetMapping("/getAll")
    public List<Internship> getAllInternships() {
        return internshipService.getAllInternships();
    }

    @GetMapping("/getAllByStudent/{id}")
    public List<Internship> getAllInternshipsFromStudentID(@PathVariable int id){return  internshipService.getInternshipsByStudentID(id);}

    @GetMapping("/remove")
    public void remove(@RequestBody Internship internship){
        internshipService.removeInternship(internship);
    }
}