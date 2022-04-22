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

    @Column(name="civilité")
    private Civilité civilité;

    public Membre() {
        super();
    }

    public Membre(Date date_naissance, byte[] CV, Civilité civilité) {
        super();
        this.date_naissance = date_naissance;
        this.CV = CV;
        this.civilité = civilité;
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

    public Civilité getCivilité() {
        return civilité;
    }

    public void setCivilité(Civilité civilité) {
        this.civilité = civilité;
    }
}
