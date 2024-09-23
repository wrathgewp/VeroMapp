package com.example.demo.Impianti_Sportivi.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Impianti_Sportivi.Models.Impianti_Sportivi;
import com.example.demo.Impianti_Sportivi.Services.Impianti_Sportivi_ServiceDB;

@RestController
@RequestMapping("/impianti_sportivi")
public class Impianti_Sportivi_Controller {
    
    @Autowired
    private Impianti_Sportivi_ServiceDB impiantiSportiviServiceDB;

    // GET per ottenere tutti gli impianti sportivi
    @GetMapping("/getAll")
    public List<Impianti_Sportivi> getAll() {
        return impiantiSportiviServiceDB.getAll();
    }

    // GET per ottenere un'impianto sportivo per ID
    @GetMapping("/getId/{id}")
    public Impianti_Sportivi getById(@PathVariable Integer id) {
        return impiantiSportiviServiceDB.getById(id);
    }

    // GET per ottenere impianti sportivi per quartiere
    @GetMapping("/getByQuartiere/{quartiere}")
    public List<Impianti_Sportivi> getByQuartiere(@PathVariable String quartiere) {
        return impiantiSportiviServiceDB.getByQuartiere(quartiere);
    }

    // POST per inserire un'impianto sportivo
    @PostMapping("/insert")
    public Impianti_Sportivi insert(@RequestBody Impianti_Sportivi impiantoSportivo) {
        return impiantiSportiviServiceDB.insertImpiantoSportivo(impiantoSportivo);
    }

    // PUT per aggiornare un'impianto sportivo
    @PutMapping("/update/{id}")
    public Impianti_Sportivi update(@PathVariable Integer id, @RequestBody Impianti_Sportivi impiantoSportivo) {
        return impiantiSportiviServiceDB.updateImpiantoSportivo(id, impiantoSportivo);
    }

    // DELETE per eliminare un'impianto sportivo
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        impiantiSportiviServiceDB.deleteImpiantoSportivo(id);
    }
}
