package com.example.demo.Aree_Verdi.Services;

import java.util.List;
import com.example.demo.Aree_Verdi.Models.Aree_Verdi;

public interface Aree_Verdi_ServiceInterface {
    
    // Metodo per ottenere tutte le aree verdi
    List<Aree_Verdi> getAll();
    
    // Metodo per ottenere un'area verde per ID
    Aree_Verdi getById(Integer id);
    
    // Metodo per ottenere aree verdi per tipo_area
    List<Aree_Verdi> getByType(String tipoArea);
    
    // Metodo per inserire un'area verde
    Aree_Verdi insertAreaVerde(Aree_Verdi areaVerde);
    
    // Metodo per aggiornare un'area verde
    Aree_Verdi updateAreaVerde(Integer id, Aree_Verdi areaVerde);
    
    // Metodo per eliminare un'area verde
    void deleteAreaVerde(Integer id);
}
