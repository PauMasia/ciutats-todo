package com.pau.TaulaSimple.service;

import com.pau.TaulaSimple.model.entitats.Pais;
import com.pau.TaulaSimple.model.repositoris.CiutatRepository;
import com.pau.TaulaSimple.model.repositoris.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService {
    @Autowired
    private PaisRepository paisRepository;
    private CiutatRepository ciutatRepository;

    private Iterable<Pais> getAllPaises(){
        return paisRepository.findAll();
    }
    private Pais savePais(Pais pais){
        return paisRepository.save(pais);
    }
}
