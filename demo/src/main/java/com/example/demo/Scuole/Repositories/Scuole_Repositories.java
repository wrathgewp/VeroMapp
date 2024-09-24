package com.example.demo.Scuole.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Scuole.Models.Scuole;

public interface Scuole_Repositories extends JpaRepository<Scuole, Integer> {
    List<Scuole> getByGrado(Integer grado);
    
}
