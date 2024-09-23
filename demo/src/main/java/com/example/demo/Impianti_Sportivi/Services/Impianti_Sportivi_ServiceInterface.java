package com.example.demo.Impianti_Sportivi.Services;

import java.util.List;
import com.example.demo.Impianti_Sportivi.Models.Impianti_Sportivi;

public interface Impianti_Sportivi_ServiceInterface {
    
    // Metodo per ottenere tutte le farmacie
    List<Impianti_Sportivi> getAll();
    
    // Metodo per ottenere una farmacia per ID
    Impianti_Sportivi getById(Integer id);
    
    // Metodo per ottenere farmacie per quartiere
    List<Impianti_Sportivi> getByType(String quartiere);
    
    // Metodo per inserire una farmacia
    Impianti_Sportivi insertAreaVerde(Impianti_Sportivi areaVerde);
    
    // Metodo per aggiornare una farmacia
    Impianti_Sportivi updateAreaVerde(Integer id, Impianti_Sportivi areaVerde);
    
    // Metodo per eliminare una farmacia
    void deleteAreaVerde(Integer id);
}
