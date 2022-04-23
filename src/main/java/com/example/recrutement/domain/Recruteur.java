package com.example.recrutement.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="recruteur")
public class Recruteur extends user {

    @Column(name="telephone")
    private long tel;

    @Column(name="adress    ")
    private String adress;


    @Column(name="description")
    private String description;


    @Column(name="gov")
    private String  gov;


    @Column(name="sector")
    private String   sector;

    public String getAdress() {
        return adress;
    }

    public Recruteur(Long id, String username, String email, String password, String nom_prenom, long tel, String adress, String description, String gov, String sector) {
        super(id, username, email, password, nom_prenom);
        this.tel = tel;
        this.adress = adress;
        this.description = description;
        this.gov = gov;
        this.sector = sector;
    }

    public Recruteur(long tel, String adress, String description, String gov, String sector) {
        this.tel = tel;
        this.adress = adress;
        this.description = description;
        this.gov = gov;
        this.sector = sector;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGov() {
        return gov;
    }

    public void setGov(String gov) {
        this.gov = gov;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Recruteur(long tel) {
        this.tel = tel;
    }

    public Recruteur() {
        super();
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

}
