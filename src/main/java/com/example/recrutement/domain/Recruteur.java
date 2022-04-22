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
