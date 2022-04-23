package com.example.recrutement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="membre")
public class Membre extends user{

    @Column(name="date_naissance")
    private Date date_naissance;

    @Column(name="CV")
    private byte[] CV;

    @Column(name="civility")
    private Civility civility;

    public Membre(Long id, String username, String email, String password, String nom_prenom, Date date_naissance, byte[] CV, Civility civility) {
        super(id, username, email, password, nom_prenom);
        this.date_naissance = date_naissance;
        this.CV = CV;
        this.civility = civility;
    }

    public Membre() {
        super();
    }

    public Membre(Date date_naissance, byte[] CV, Civility civility) {
        super();
        this.date_naissance = date_naissance;
        this.CV = CV;
        this.civility = civility;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public byte[] getCV() {
        return CV;
    }

    public void setCV(byte[] CV) {
        this.CV = CV;
    }

    public Civility getCivility() {
        return civility;
    }

    public void setCivility(Civility civility) {
        this.civility = civility;
    }
}
