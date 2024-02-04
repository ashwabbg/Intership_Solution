package com.example.intership_solution.service;

import com.example.intership_solution.model.CdC;

import com.example.intership_solution.model.CdC;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

public interface CdCService {
    public CdC saveCdC(CdC cdC);
    public Stream<CdC> getAllCdCs();
    public CdC saveCdC(MultipartFile file) throws IOException;
    public CdC getCdC(String id);
}