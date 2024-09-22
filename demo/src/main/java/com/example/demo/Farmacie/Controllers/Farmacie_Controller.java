package com.example.demo.Farmacie.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Farmacie.Models.Farmacie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Farmacie.Services.Farmacie_ServiceDB;


@RestController
@RequestMapping("/farmacie")
public class Farmacie_Controller {

    @Autowired
    private Farmacie_ServiceDB farmacieServiceDB;

    // GET per ottenere tutte le farmacie
    @GetMapping("/getAll")
    public List<Farmacie> getAll() {
        return farmacieServiceDB.getAll();
    }

    // GET per ottenere un'area verde per ID
    @GetMapping("/getId/{id}")
    public Farmacie getById(@PathVariable Integer id) {
        return farmacieServiceDB.getById(id);
    }

    // GET per ottenere farmacie per tipo_area
    @GetMapping("/getByType/{tipo_area}")
    public List<Farmacie> getByType(@PathVariable String tipo_area) {
        return farmacieServiceDB.getByType(tipo_area);
    }

    // POST per inserire una farmacia
    @PostMapping("/insert")
    public Farmacie insert(@RequestBody Farmacie areaVerde) {
        return farmacieServiceDB.insertAreaVerde(areaVerde);
    }

    // PUT per aggiornare una farmacia
    @PutMapping("/update/{id}")
    public Farmacie update(@PathVariable Integer id, @RequestBody Farmacie areaVerde) {
        return farmacieServiceDB.updateAreaVerde(id, areaVerde);
    }

    // DELETE per eliminare una farmacia
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        farmacieServiceDB.deleteAreaVerde(id);
    }
}
