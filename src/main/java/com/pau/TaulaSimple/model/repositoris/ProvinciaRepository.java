package com.pau.TaulaSimple.model.repositoris;

import com.pau.TaulaSimple.model.entitats.Provincia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//                                                   Classe provincia | Id clase provincia
public interface ProvinciaRepository extends CrudRepository<Provincia, Long> {
    List<Provincia> findByNom(String nom);
}

