package com.pau.TaulaSimple.model.repositoris;

import com.pau.TaulaSimple.model.entitats.Ciutat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//                                                Classe ciutat | Id clase Ciutat
public interface CiutatRepository extends JpaRepository<Ciutat, Long> {
}
