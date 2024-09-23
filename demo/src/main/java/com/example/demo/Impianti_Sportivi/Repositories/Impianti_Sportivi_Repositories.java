package com.example.demo.Impianti_Sportivi.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Impianti_Sportivi.Models.Impianti_Sportivi;

public interface Impianti_Sportivi_Repositories extends JpaRepository<Impianti_Sportivi, Integer> {
    List<Impianti_Sportivi> findByQuartiere(String quartiere);
}
