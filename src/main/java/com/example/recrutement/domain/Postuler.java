package com.example.recrutement.domain;

import javax.persistence.*;

@Entity
@Table(name="postuler")
public class Postuler {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int Id;

    private int idoffre;

    private int idcondidat;

    private String etat;

    public Postuler() {
        super();
    }

    public Postuler(int id, int idoffre, int idcondidat, String etat) {
        Id = id;
        this.idoffre = idoffre;
        this.idcondidat = idcondidat;
        this.etat = etat;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getIdoffre() {
        return idoffre;
    }

    public void setIdoffre(int idoffre) {
        this.idoffre = idoffre;
    }

    public int getIdcondidat() {
        return idcondidat;
    }

    public void setIdcondidat(int idcondidat) {
        this.idcondidat = idcondidat;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
