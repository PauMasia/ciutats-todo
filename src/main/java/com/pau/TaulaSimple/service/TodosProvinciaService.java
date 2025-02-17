package com.pau.TaulaSimple.service;

import com.pau.TaulaSimple.model.entitats.Provincia;
import com.pau.TaulaSimple.model.repositoris.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodosProvinciaService {
    @Autowired
    private ProvinciaRepository provinciaRepository;

    public Iterable<Provincia> getAllProvincia() {
        return provinciaRepository.findAll();
    }

}
