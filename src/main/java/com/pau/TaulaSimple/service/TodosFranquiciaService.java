package com.pau.TaulaSimple.service;

import com.pau.TaulaSimple.model.entitats.Franquicia;
import com.pau.TaulaSimple.model.repositoris.FranquiciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodosFranquiciaService {
    @Autowired
    private FranquiciaRepository franquiciaRepository;

    public Iterable<Franquicia> getAllFranquicias(){
        return franquiciaRepository.findAll();

    }

}
