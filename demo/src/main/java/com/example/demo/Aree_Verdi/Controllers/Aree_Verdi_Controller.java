package com.example.demo.Aree_Verdi.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Aree_Verdi.Models.Aree_Verdi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/aree_verdi")
public class Aree_Verdi_Controller {
    
    @GetMapping("get/all")
    public List<Aree_Verdi> getAll() {
        return null;
    }
}
