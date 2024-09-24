package com.example.demo.Aree_Verdi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Aree_Verdi.Models.Aree_Verdi;
import com.example.demo.Aree_Verdi.Repositories.Aree_Verdi_Repositories;

@Service
public class Aree_Verdi_ServiceDB implements Aree_Verdi_ServiceInterface {
    @Autowired
    private Aree_Verdi_Repositories aree_verdi_repositories;

    // Metodo per ottenere tutte le aree verdi
    @Transactional(readOnly = true)
    public List<Aree_Verdi> getAll() {
        return aree_verdi_repositories.findAllByOrderByIdAsc();
    }

    // Metodo per ottenere un'area verde per ID
    @Transactional(readOnly = true)
    public Aree_Verdi getById(Integer id) {
        return aree_verdi_repositories.findById(id)
                .orElseThrow(() -> new RuntimeException("Area non trovata."));
    }

    // Metodo per ottenere aree verdi per tipo_area
    @Transactional(readOnly = true)
    public List<Aree_Verdi> getByType(String tipoArea) {
        if (tipoArea != null && !tipoArea.isEmpty()) {
            return aree_verdi_repositories.findByTipoArea(tipoArea);
        } else {
            throw new IllegalArgumentException("Il tipo_area non può essere nullo o vuoto.");
        }
    }

    // Metodo per inserire un'area verde
    @Transactional
    public Aree_Verdi insertAreaVerde(Aree_Verdi areaVerde) {
        return aree_verdi_repositories.save(areaVerde);
    }

    // Metodo per aggiornare un'area verde
    @Transactional
    public Aree_Verdi updateAreaVerde(Integer id, Aree_Verdi areaVerde) {
        Aree_Verdi existingAreaVerde = aree_verdi_repositories.findById(id)
                .orElseThrow(() -> new RuntimeException("Area non trovata."));
        
        existingAreaVerde.setNome_layer(areaVerde.getNome_layer());
        existingAreaVerde.setCodice(areaVerde.getCodice());
        existingAreaVerde.setId_oggetto(areaVerde.getId_oggetto());
        existingAreaVerde.setCod_via(areaVerde.getCod_via());
        existingAreaVerde.setCensimento(areaVerde.getCensimento());
        existingAreaVerde.setTipo_area(areaVerde.getTipo_area());
        existingAreaVerde.setDenominazi(areaVerde.getDenominazi());
        existingAreaVerde.setNome_via(areaVerde.getNome_via());
        existingAreaVerde.setSup_verde(areaVerde.getSup_verde());
        existingAreaVerde.setSup_pavim(areaVerde.getSup_pavim());
        existingAreaVerde.setIrrigazion(areaVerde.getIrrigazion());
        existingAreaVerde.setManutenzio(areaVerde.getManutenzio());
        existingAreaVerde.setAnnotazion(areaVerde.getAnnotazion());
        existingAreaVerde.setCircoscriz(areaVerde.getCircoscriz());
        existingAreaVerde.setAggiorname(areaVerde.getAggiorname());
        existingAreaVerde.setTooltip(areaVerde.getTooltip());
        existingAreaVerde.setUrl_rel(areaVerde.getUrl_rel());
        return aree_verdi_repositories.save(existingAreaVerde);
    }

    // Metodo per eliminare un'area verde
    @Transactional
    public void deleteAreaVerde(Integer id) {
        Aree_Verdi areaVerde = aree_verdi_repositories.findById(id)
                .orElseThrow(() -> new RuntimeException("Area non trovata."));
        aree_verdi_repositories.delete(areaVerde);
    }
}
