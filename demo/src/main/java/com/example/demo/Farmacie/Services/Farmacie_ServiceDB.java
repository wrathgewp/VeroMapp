package com.example.demo.Farmacie.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Farmacie.Models.Farmacie;
import com.example.demo.Farmacie.Repositories.Farmacie_Repositories;

@Service
public class Farmacie_ServiceDB implements Farmacie_ServiceInterface {
    @Autowired
    private Farmacie_Repositories farmacie_repositories;

    // Metodo per ottenere tutte le farmacie
    @Transactional(readOnly = true)
    public List<Farmacie> getAll() {
        return farmacie_repositories.findAll();
    }

    // Metodo per ottenere un'area verde per ID
    @Transactional(readOnly = true)
    public Farmacie getById(Integer id) {
        return farmacie_repositories.findById(id)
                .orElseThrow(() -> new RuntimeException("Farmacia non trovata."));
    }

    // Metodo per ottenere farmacie per quartiere
    @Transactional(readOnly = true)
    public List<Farmacie> getByQuartiere(String quartiere) {
        if (quartiere != null && !quartiere.isEmpty()) {
        return farmacie_repositories.findByQuartiere(quartiere);
        } else {
            throw new IllegalArgumentException("Il tipo_area non può essere nullo o vuoto.");
        }
    }

    // Metodo per inserire un'area verde
    @Transactional
    public Farmacie insertAreaVerde(Farmacie areaVerde) {
        return farmacie_repositories.save(areaVerde);
    }

    // Metodo per aggiornare un'area verde
    @Transactional
    public Farmacie updateAreaVerde(Integer id, Farmacie areaVerde) {
        Farmacie existingAreaVerde = farmacie_repositories.findById(id)
                .orElseThrow(() -> new RuntimeException("Farmacia non trovata."));
        
        return farmacie_repositories.save(existingAreaVerde);
    }

    // Metodo per eliminare un'area verde
    @Transactional
    public void deleteAreaVerde(Integer id) {
        Farmacie areaVerde = farmacie_repositories.findById(id)
                .orElseThrow(() -> new RuntimeException("Farmacia non trovata."));
        farmacie_repositories.delete(areaVerde);
    }
}
