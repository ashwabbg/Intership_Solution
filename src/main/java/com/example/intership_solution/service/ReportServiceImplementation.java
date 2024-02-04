package com.example.intership_solution.service;

import com.example.intership_solution.model.Report;
import com.example.intership_solution.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;
import java.util.stream.Stream;

@Service
public class ReportServiceImplementation implements ReportService {

    @Autowired
    private ReportRepository reportRepository;

    @Override
    public Report saveReport(Report report) {
        return null;
    }

    @Override
    public Report saveReport(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        Report report = new Report(fileName, file.getContentType(), file.getBytes());

        return reportRepository.save(report);
    }

    @Override
    public Report getReport(String id) {
        return reportRepository.findById(Integer.valueOf(id)).get();
    }

    public Stream<Report> getAllReports() {
           return reportRepository.findAll().stream();
    }
}