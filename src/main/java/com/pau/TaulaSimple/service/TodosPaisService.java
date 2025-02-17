package com.pau.TaulaSimple.service;

import com.pau.TaulaSimple.model.entitats.Pais;
import com.pau.TaulaSimple.model.repositoris.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodosPaisService {
    @Autowired
    public PaisRepository paisRepository;

    public Iterable<Pais> getAllPaises() {
        return paisRepository.findAll();
    }
}
