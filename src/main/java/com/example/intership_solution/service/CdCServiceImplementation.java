package com.example.intership_solution.service;

import com.example.intership_solution.model.CdC;
import com.example.intership_solution.repository.CdCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;
import java.util.stream.Stream;

@Service
public class CdCServiceImplementation implements CdCService {

    @Autowired
    private CdCRepository cdCRepository;

    @Override
    public CdC saveCdC(CdC cdC) {
        return null;
    }

    @Override
    public CdC saveCdC(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        CdC cdC = new CdC(fileName, file.getContentType(), file.getBytes());

        return cdCRepository.save(cdC);
    }

    @Override
    public CdC getCdC(String id) {
        return cdCRepository.findById(Integer.valueOf(id)).get();
    }

    public Stream<CdC> getAllCdCs() {
        return cdCRepository.findAll().stream();
    }
}