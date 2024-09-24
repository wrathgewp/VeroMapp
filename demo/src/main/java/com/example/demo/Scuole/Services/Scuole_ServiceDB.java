package com.example.demo.Scuole.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Scuole.Models.Scuole;
import com.example.demo.Scuole.Repositories.Scuole_Repositories;
import org.springframework.transaction.annotation.Transactional;
@Service
public class Scuole_ServiceDB implements Scuole_ServiceInterface {
    @Autowired
    private Scuole_Repositories scuole_repositories;

    // Metodo per ottenere tutte le scuole
    @Transactional(readOnly = true)
    public List<Scuole> getAll() {
        return scuole_repositories.findAll();
    }

    // Metodo per ottenere una scuola per ID
    @Transactional(readOnly = true)
    public Scuole getById(Integer id) {
        return scuole_repositories.findById(id)
                .orElseThrow(() -> new RuntimeException("Scuola non trovata."));
    }

    // Metodo per ottenere scuole per grado
    @Transactional(readOnly = true)
    public List<Scuole> getByGrado(Integer grado) {
        if (grado != null) {
        return scuole_repositories.getByGrado(grado);
        } else {
            throw new IllegalArgumentException("Il tipo_area non può essere nullo o vuoto.");
        }
    }

    // Metodo per inserire una scuola
    @Transactional
    public Scuole insertScuola(Scuole scuola) {
        return scuole_repositories.save(scuola);
    }

    // Metodo per aggiornare una scuola
    @Transactional
    public Scuole updateScuola(Integer id, Scuole scuola) {
        Scuole existingScuola = scuole_repositories.findById(id)
                .orElseThrow(() -> new RuntimeException("Scuola non trovata."));

            return scuole_repositories.save(existingScuola);
    }

    // Metodo per eliminare una scuola
    @Transactional
    public void deleteScuola(Integer id) {
        scuole_repositories.deleteById(id);
    }
}
