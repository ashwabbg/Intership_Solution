package com.example.intership_solution.service;

import com.example.intership_solution.model.Report;

import java.util.List;

public interface ReportService {
    public Report saveReport(Report report);
    public List<Report> getAllReports();
}