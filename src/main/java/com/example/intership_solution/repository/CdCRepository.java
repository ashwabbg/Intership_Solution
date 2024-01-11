package com.example.intership_solution.repository;

import com.example.intership_solution.model.CdC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CdCRepository extends JpaRepository<CdC, Integer>{
}