package com.pau.TaulaSimple.model.entitats;

import jakarta.persistence.*;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.List;

@Entity
@Table(name = "PROVINCIA")
public class Provincia{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    public long id;
    public String nom;
    @ManyToOne
    @JoinColumn(name = "pais_id")
    public Pais idPais;
    @OneToMany(mappedBy = "id",cascade = CascadeType.ALL)
    public List<Ciutat> ciutats;

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

    public Pais getIdPais() {
        return idPais;
    }

    public void setIdPais(Pais idPais) {
        this.idPais = idPais;
    }

    public List<Ciutat> getCiutats() {
        return ciutats;
    }

    public void setCiutats(List<Ciutat> ciutats) {
        this.ciutats = ciutats;
    }
}