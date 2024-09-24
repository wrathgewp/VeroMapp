package com.example.demo.Scuole.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Scuole.Models.Scuole;
import com.example.demo.Scuole.Services.Scuole_ServiceDB;

@RestController
@RequestMapping("/scuole")
public class Scuole_Controller {
    
    @Autowired
    private Scuole_ServiceDB scuoleServiceDB;

    // GET per ottenere tutte le scuole
    @GetMapping("/getAll")
    public List<Scuole> getAll() {
        return scuoleServiceDB.getAll();
    }

    // GET per ottenere una scuola per ID
    @GetMapping("/getId/{id}")
    public Scuole getById(@PathVariable Integer id) {
        return scuoleServiceDB.getById(id);
    }

    // GET per ottenere scuole per grado
    @GetMapping("/getByGrade/{grado}")
    public List<Scuole> getByGrade(@PathVariable Integer grado) {
        return scuoleServiceDB.getByGrade(grado);
    }

    // POST per inserire una scuola
    @PostMapping("/insert")
    public Scuole insert(@RequestBody Scuole scuola) {
        return scuoleServiceDB.insertScuola(scuola);
    }

    // PUT per aggiornare una scuola
    @PostMapping("/update/{id}")
    public Scuole update(@PathVariable Integer id, @RequestBody Scuole scuola) {
        return scuoleServiceDB.updateScuola(id, scuola);
    }

    // DELETE per eliminare una scuola
    @PostMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        scuoleServiceDB.deleteScuola(id);
    }


}
