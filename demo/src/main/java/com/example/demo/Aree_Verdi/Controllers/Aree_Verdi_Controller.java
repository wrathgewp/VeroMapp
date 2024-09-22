package com.example.demo.Aree_Verdi.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Aree_Verdi.Models.Aree_Verdi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Aree_Verdi.Services.Aree_Verdi_ServiceDB;


@RestController
@RequestMapping("/aree_verdi")
public class Aree_Verdi_Controller {

    @Autowired
    private Aree_Verdi_ServiceDB areeVerdiServiceDB;

    // GET per ottenere tutte le aree verdi
    @GetMapping("/getAll")
    public List<Aree_Verdi> getAll() {
        return areeVerdiServiceDB.getAll();
    }

    // GET per ottenere un'area verde per ID
    @GetMapping("/getId/{id}")
    public Aree_Verdi getById(@PathVariable Integer id) {
        return areeVerdiServiceDB.getById(id);
    }

    // GET per ottenere aree verdi per tipo_area
    @GetMapping("/getByType/{tipo_area}")
    public List<Aree_Verdi> getByType(@PathVariable String tipo_area) {
        return areeVerdiServiceDB.getByType(tipo_area);
    }

    // POST per inserire un'area verde
    @PostMapping("/insert")
    public Aree_Verdi insert(@RequestBody Aree_Verdi areaVerde) {
        return areeVerdiServiceDB.insertAreaVerde(areaVerde);
    }

    // PUT per aggiornare un'area verde
    @PutMapping("/update/{id}")
    public Aree_Verdi update(@PathVariable Integer id, @RequestBody Aree_Verdi areaVerde) {
        return areeVerdiServiceDB.updateAreaVerde(id, areaVerde);
    }

    // DELETE per eliminare un'area verde
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        areeVerdiServiceDB.deleteAreaVerde(id);
    }
}
