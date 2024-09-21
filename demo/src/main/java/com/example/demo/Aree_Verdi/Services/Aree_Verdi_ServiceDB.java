package com.example.demo.Aree_Verdi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Aree_Verdi.Models.Aree_Verdi;
import com.example.demo.Aree_Verdi.Repositories.Aree_Verdi_Repositories;

// Quali chiamate fare
// 1. getAll() -- FATTO
// 2. getById(id) -- FATTO
// 3. getByType(tipoArea) -- FATTO
// 4. insert(Aree_Verdi)
// 5. update(Aree_Verdi)
// 6. delete(id)

@Service
public class Aree_Verdi_ServiceDB {
    @Autowired
    private Aree_Verdi_Repositories aree_verdi_repositories;

    @Transactional(readOnly = true)
    public List<Aree_Verdi> getAll() {
        return aree_verdi_repositories.findAll();
    }

    @Transactional(readOnly = true)
    public Aree_Verdi getById(Integer id) {
        return aree_verdi_repositories.findById(id)
                .orElseThrow(() -> new RuntimeException("Area non trovata."));
    }

    @Transactional(readOnly = true)
    public List<Aree_Verdi> getByType(String tipoArea) {
        if (tipoArea != null && !tipoArea.isEmpty()) {
            return aree_verdi_repositories.findByTipoArea(tipoArea);
        } else {
            throw new IllegalArgumentException("Il tipo_area non può essere nullo o vuoto.");
        }
    }
}
