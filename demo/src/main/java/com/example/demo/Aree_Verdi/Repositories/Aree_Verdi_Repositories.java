package com.example.demo.Aree_Verdi.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Aree_Verdi.Models.Aree_Verdi;

public interface Aree_Verdi_Repositories extends JpaRepository<Aree_Verdi, Integer> {
    List<Aree_Verdi> findByTipoArea(String tipoArea);
}
