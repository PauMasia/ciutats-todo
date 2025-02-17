package com.pau.TaulaSimple.model.repositoris;

import com.pau.TaulaSimple.model.entitats.Franquicia;
import com.pau.TaulaSimple.model.entitats.Pais;
import com.pau.TaulaSimple.model.entitats.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FranquiciaRepository extends CrudRepository<Franquicia, Long> {
    List<Franquicia> findFranquiciaByNom(String nom);
}

