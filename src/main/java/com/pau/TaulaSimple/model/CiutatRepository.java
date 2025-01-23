package com.pau.TaulaSimple.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//                                                Classe ciutat | Id clase Ciutat
public interface CiutatRepository extends CrudRepository<Ciutat , Long> {
    List<Ciutat> findByNom(String nom);
}
