package com.example.intership_solution.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Internship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int internship_id;

    private String title;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public int getInternship_id() {
        return internship_id;
    }

    public void setInternship_id(int internship_id) {
        this.internship_id = internship_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}