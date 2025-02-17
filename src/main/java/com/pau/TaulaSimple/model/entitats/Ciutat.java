package com.pau.TaulaSimple.model.entitats;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

//package com.pau.TaulaSimple.model;
//
//record Ciutat (    long id,
//        String nom,
//        int poblacio,
//        String descripcio,
//        String imatge
//){
//
//}
@Entity @Table(name = "CIUTAT")
public class Ciutat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    long id;
    //    @Column(nullable = false)
    String nom;
    int poblacio;
    String descripcio;
    String imatge;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "provincia_id")
    public Provincia idProvincia;

    @ManyToMany
    @JoinTable(name = "CIUTAT_FRANQUICIA",
            joinColumns = @JoinColumn(name = "FRANQUICIA_ID"),
            inverseJoinColumns = @JoinColumn(name = "CIUTAT_ID")
    )
    List<Franquicia> franquicias;

    public Ciutat() {
    }

    public Ciutat(long id, String nom, int poblacio, String descripcio, String imatge) {
        this.id = id;
        this.nom = nom;
        this.poblacio = poblacio;
        this.descripcio = descripcio;
        this.imatge = imatge;
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

    public int getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(int poblacio) {
        this.poblacio = poblacio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getImatge() {
        return imatge;
    }

    public void setImatge(String imatge) {
        this.imatge = imatge;
    }

    @Override
    public String toString() {
        return nom ;
    }

    public List<Franquicia> getFranquicias() {
        return franquicias;
    }
}
