package com.example.demo.Farmacie.Services;

import java.util.List;
import com.example.demo.Farmacie.Models.Farmacie;

public interface Farmacie_ServiceInterface {
    
    // Metodo per ottenere tutte le farmacie
    List<Farmacie> getAll();
    
    // Metodo per ottenere una farmacia per ID
    Farmacie getById(Integer id);
    
    // Metodo per ottenere farmacie per quartiere
    List<Farmacie> getByType(String quartiere);
    
    // Metodo per inserire una farmacia
    Farmacie insertAreaVerde(Farmacie areaVerde);
    
    // Metodo per aggiornare una farmacia
    Farmacie updateAreaVerde(Integer id, Farmacie areaVerde);
    
    // Metodo per eliminare una farmacia
    void deleteAreaVerde(Integer id);
}
