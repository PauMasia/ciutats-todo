package com.pau.TaulaSimple.model.entitats;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PAIS")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String nom;
    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    public List<Provincia> provincias;

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

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }
}
