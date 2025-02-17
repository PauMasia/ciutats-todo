package com.pau.TaulaSimple.model.repositoris;

import com.pau.TaulaSimple.model.entitats.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//                                              Classe paisos.html | Id clase paisos.html
public interface PaisRepository extends CrudRepository<Pais, Long> {
    List<Pais> findByNom(String nom);
}

