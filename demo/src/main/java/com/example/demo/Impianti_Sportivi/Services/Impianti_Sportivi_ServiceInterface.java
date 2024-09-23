package com.example.demo.Impianti_Sportivi.Services;

import java.util.List;
import com.example.demo.Impianti_Sportivi.Models.Impianti_Sportivi;

public class Impianti_Sportivi_ServiceInterface {
    // Metodo per ottenere tutte le impianti sportivi
    List<Impianti_Sportivi> getAll();
    
    // Metodo per ottenere una impianto sportivo per ID
    Impianti_Sportivi getById(Integer id);
    
    // Metodo per ottenere impianti sportivi per quartiere
    List<Impianti_Sportivi> getByType(String quartiere);
    
    // Metodo per inserire una impianto sportivo
    Impianti_Sportivi insertAreaVerde(Impianti_Sportivi areaVerde);
    
    // Metodo per aggiornare una impianto sportivo
    Impianti_Sportivi updateAreaVerde(Integer id, Impianti_Sportivi areaVerde);
    
    // Metodo per eliminare una impianto sportivo
    void deleteAreaVerde(Integer id);
}
