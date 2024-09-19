package com.example.demo.Aree_Verdi.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Aree_Verdi.Models.Aree_Verdi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
}
