package com.example.demo.Aree_Verdi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Aree_Verdi.Models.Aree_Verdi;
import com.example.demo.Aree_Verdi.Repositories.Aree_Verdi_Repositories;


@Service
public class Aree_Verdi_ServiceDB {
    @Autowired
    private Aree_Verdi_Repositories aree_verdi_repositories;

    @Transactional(readOnly = true)
    public List<Aree_Verdi> findAll() {
        return aree_verdi_repositories.findAll();
    }
}
