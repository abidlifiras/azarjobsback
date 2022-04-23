package com.example.recrutement.controller;

import com.example.recrutement.domain.Membre;
import com.example.recrutement.domain.Offre;
import com.example.recrutement.repository.OffreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*" )
@RestController
@RequestMapping(path="/jobs ")
public class OffreControll {

    @Autowired
    private final OffreRepo offreRepo;

    public OffreControll(OffreRepo offreRepo) {
        this.offreRepo = offreRepo;
    }

    @GetMapping(path = "")
    public List<Offre> touslesoffres() {
        return offreRepo.findAll();
    }
    //affiche par titre

    @RequestMapping(value = "/{titre}", method = RequestMethod.GET)
    public ResponseEntity<Offre> findByTitre(@PathVariable("titre") String id) {
        Optional<Offre> resultat = offreRepo.findByTitre(id);
        if (resultat.isPresent())
            return new ResponseEntity<>(resultat.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //ajoutoffre
    @PostMapping(path = "")
    public ResponseEntity<Offre> create(@RequestBody Offre c) {
        offreRepo.save(c);
        return new ResponseEntity<Offre>(c, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{titre}")
    public Offre update(@PathVariable("titre") String name, @RequestBody Offre c) {

        return offreRepo.findByTitre(name)
                .map(employee -> {
                    employee.setDescription(c.getDescription());
                    employee.setEsperationDate(c.getEsperationDate());
                    employee.setLevel(c.getLevel());
                    employee.setRequirement(c.getRequirement());
                    employee.setTags(c.getTags());
                    return offreRepo.save(employee);
                })
                .orElseGet(() -> {
                    c.setTitre(name);
                    return offreRepo.save(c);
                });
    }
}
