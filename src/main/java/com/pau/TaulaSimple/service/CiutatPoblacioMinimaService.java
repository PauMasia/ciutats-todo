package com.pau.TaulaSimple.service;

import com.pau.TaulaSimple.model.entitats.Ciutat;
import com.pau.TaulaSimple.model.repositoris.CiutatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@Service
public class CiutatPoblacioMinimaService {
    @Autowired
    private CiutatRepository ciutatRepository;

    public List<Ciutat> obtenirCiutatsAmbPoblacioMinima(int poblacioMinima){
        List<Ciutat> totesLesCiutats= (List<Ciutat>) ciutatRepository.findAll();
        List<Ciutat> ciutatsFiltrades= new ArrayList<>();
        for (Ciutat ciutat: totesLesCiutats){
            if (ciutat.getPoblacio() > poblacioMinima){
                ciutatsFiltrades.add(ciutat);
            }
        }
        return ciutatsFiltrades;
    }
    //rehacer con streams
}
