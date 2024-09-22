package com.example.demo.Farmacie.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Farmacie.Models.Farmacie;

public interface Farmacie_Repositories extends JpaRepository<Farmacie, Integer> {
    List<Farmacie> findByQuartiere(String quartiere);
}
