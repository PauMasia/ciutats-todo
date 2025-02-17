package com.pau.TaulaSimple.model.entitats;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;
@Entity
@Table(name = "FRANQUICIA")
public class Franquicia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    private String nom;

    @ManyToMany(mappedBy = "franquicias ")
    List<Ciutat> ciutats;

    public Franquicia() {
    }

    public Franquicia(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Ciutat> getCiutats() {
        return ciutats;
    }

    public void setCiutats(List<Ciutat> ciutats) {
        this.ciutats = ciutats;
    }
}
