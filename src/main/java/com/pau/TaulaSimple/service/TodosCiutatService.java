package com.pau.TaulaSimple.service;

import com.pau.TaulaSimple.model.entitats.Ciutat;
import com.pau.TaulaSimple.model.repositoris.CiutatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodosCiutatService {
    @Autowired
    private CiutatRepository ciutatRepository;

    public Iterable<Ciutat> getAllCiutats() {
        return ciutatRepository.findAll();
    }
}
