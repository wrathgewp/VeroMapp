package com.example.demo.Scuole.Services;

import java.util.List;
import com.example.demo.Scuole.Models.Scuole;

public interface Scuole_ServiceInterface {
    
    // Metodo per ottenere tutte le scuole
    List<Scuole> getAll();

    // Metodo per ottenere una scuola per ID
    Scuole getById(Integer id);

    // Metodo per ottenere scuole per grado
    List<Scuole> getByGrado(Integer grado);

}
