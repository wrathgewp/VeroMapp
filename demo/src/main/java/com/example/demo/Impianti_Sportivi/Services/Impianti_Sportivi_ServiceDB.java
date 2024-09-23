package com.example.demo.Impianti_Sportivi.Services;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Impianti_Sportivi.Repositories.Impianti_Sportivi_Repositories;

@Service
public class Impianti_Sportivi_ServiceDB {
    @Autowired
    private Impianti_Sportivi_Repositories impiantiSportiviRepositories;

    // Metodo per ottenere tutti gli impianti sportivi
    public List<Impianti_Sportivi> getAll() {
        return impiantiSportiviRepositories.findAll();
    }

    // Metodo per ottenere un'impianto sportivo per ID
    public Impianti_Sportivi getById(Integer id) {
        return impiantiSportiviRepositories.findById(id)
                .orElseThrow(() -> new RuntimeException("Impianto sportivo non trovato."));
    }

    // Metodo per ottenere impianti sportivi per quartiere
    public List<Impianti_Sportivi> getByQuartiere(String quartiere) {
        if (quartiere != null && !quartiere.isEmpty()) {
            return impiantiSportiviRepositories.findByQuartiere(quartiere);
        } else {
            throw new IllegalArgumentException("Il tipo_area non può essere nullo o vuoto.");
        }
    }

    // Metodo per inserire un'impianto sportivo
    public Impianti_Sportivi insertImpiantoSportivo(Impianti_Sportivi impiantoSportivo) {
        return impiantiSportiviRepositories.save(impiantoSportivo);
    }

    // Metodo per aggiornare un'impianto sportivo
    public Impianti_Sportivi updateImpiantoSportivo(Integer id, Impianti_Sportivi impiantoSportivo) {
        Impianti_Sportivi existingImpiantoSportivo = impiantiSportiviRepositories.findById(id)
                .orElseThrow(() -> new RuntimeException("Impianto sportivo non trovato."));
        return impiantiSportiviRepositories.save(impiantoSportivo);
    }

    // Metodo per eliminare un'impianto sportivo
    public void deleteImpiantoSportivo(Integer id) {
        impiantiSportiviRepositories.deleteById(id);
    }
}
