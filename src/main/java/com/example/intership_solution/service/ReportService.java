package com.example.intership_solution.service;

import com.example.intership_solution.model.Report;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

public interface ReportService {
    public Report saveReport(Report report);
    public Stream<Report> getAllReports();
    public Report saveReport(MultipartFile file) throws IOException;
    public Report getReport(String id);
}