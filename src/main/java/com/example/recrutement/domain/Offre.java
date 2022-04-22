package com.example.recrutement.domain;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="offre")
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="title")
    private String titre;

    @Column(name="description")
    private String Description;

    @Column(name="creationDate")
    private Date creationDate;

    @Column(name="experationDate")
    private Date esperationDate;

    @Column(name="type")
    private String type;

    @Column(name="levelStudy")
    private String level;

    @Column(name="requirement")
    private String requirement;

    @Column(name="tags")
    private String tags;

    public Offre() {
        super();
    }

    public Offre(int id, String titre, String description, Date creationDate, Date esperationDate, String type, String level, String requirement, String tags) {
        this.id = id;
        this.titre = titre;
        Description = description;
        this.creationDate = creationDate;
        this.esperationDate = esperationDate;
        this.type = type;
        this.level = level;
        this.requirement = requirement;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getEsperationDate() {
        return esperationDate;
    }

    public void setEsperationDate(Date esperationDate) {
        this.esperationDate = esperationDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
