package com.example.intership_solution.service;

import com.example.intership_solution.model.CdC;

import java.util.List;

public interface CdCService {
    public CdC saveCdC(CdC cdC);
    public List<CdC> getAllCdCs();
}