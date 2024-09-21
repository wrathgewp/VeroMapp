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

    @GetMapping("/getAll/all")  // Aggiunto "/"
    public List<Aree_Verdi> getAll() {
        return areeVerdiServiceDB.getAll();
    }

    @GetMapping("/getId/{id}")
    public Aree_Verdi getById(@PathVariable Integer id) {
        return areeVerdiServiceDB.getById(id);
    }

    @GetMapping("/getByType/{tipo_area}")
    public List<Aree_Verdi> getByType(@PathVariable String tipo_area) {
        return areeVerdiServiceDB.getByType(tipo_area);
    }

    @PostMapping("/insert")
    public Aree_Verdi insert(@RequestBody Aree_Verdi areaVerde) {
        return areeVerdiServiceDB.insertAreaVerde(areaVerde);
    }

    @PutMapping("/update/{id}")
    public Aree_Verdi update(@PathVariable Integer id, @RequestBody Aree_Verdi areaVerde) {
        Aree_Verdi existingAreaVerde = areeVerdiServiceDB.getById(id);
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

        return areeVerdiServiceDB.insertAreaVerde(existingAreaVerde);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        areeVerdiServiceDB.deleteAreaVerde(id);
    }
}
