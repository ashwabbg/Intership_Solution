package com.example.intership_solution.service;

import com.example.intership_solution.model.CdC;
import com.example.intership_solution.repository.CdCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CdCServiceImplementation implements CdCService {

    @Autowired
    private CdCRepository cdCRepository;

    @Override
    public CdC saveCdC(CdC cdC) {
        return cdCRepository.save(cdC);
    }

    @Override
    public List<CdC> getAllCdCs() {
        return cdCRepository.findAll();
    }
}