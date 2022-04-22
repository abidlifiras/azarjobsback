package com.example.recrutement.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="societe")
public class Societe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="nom",unique = true)
    private String nom;

    @Column(name="adresse")
    private String adresse;

    @Column(name="description")
    private String description;

    @Column(name="site_web")
    private String site;

    @Column(name="logo")
    private byte[] logo;

    public Societe() {
        super();
    }

    public Societe(int id, String nom, String adresse, String description, String site, byte[] logo) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.description = description;
        this.site = site;
        this.logo = logo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }
}
