package com.pau.TaulaSimple.model;

import jakarta.persistence.*;

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
@Entity
@Table//(name = "Ciudades")
public class Ciutat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    long id;
    //    @Column(nullable = false)
    String nom;

    int poblacio;
    String descripcio;
    String imatge;

    public Ciutat() {
    }

    public Ciutat(long id, String nom, int poblacio, String descripcio, String imatge) {
        this.id = id;
        this.nom = nom;
        this.poblacio = poblacio;
        this.descripcio = descripcio;
        Str
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
}
