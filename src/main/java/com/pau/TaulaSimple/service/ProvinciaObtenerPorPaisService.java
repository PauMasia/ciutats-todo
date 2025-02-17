package com.pau.TaulaSimple.service;

import com.pau.TaulaSimple.model.entitats.Provincia;
import com.pau.TaulaSimple.model.repositoris.ProvinciaRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProvinciaObtenerPorPaisService {
    @Autowired
    private ProvinciaRepository pr;
    public List<Provincia> obtenerProvinciasPorPais(String nombrePais){
        List<Provincia> provincias= (List<Provincia>) pr.findAll();
        List<Provincia> resultado= new ArrayList<>();

        for (Provincia provincia: provincias){
            if (provincia.getIdPais().getNom().equalsIgnoreCase(nombrePais)){
                resultado.add(provincia);
            }
        }
        return resultado;
    }
}
