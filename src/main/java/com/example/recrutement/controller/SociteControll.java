package com.example.recrutement.controller;

import com.example.recrutement.domain.Membre;
import com.example.recrutement.domain.Societe;
import com.example.recrutement.repository.SocieteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*" )
@RestController
@RequestMapping(path="/employeur")
public class SociteControll {

    @Autowired
    private final SocieteRepo societeRepo;

    public SociteControll(SocieteRepo societeRepo) {
        this.societeRepo = societeRepo;
    }
    @GetMapping(path="")

    public List<Societe> getall()  {
        return  societeRepo.findAll();
    }


    //ajout compte

    @PostMapping(path="")
    public  ResponseEntity<Societe> create( @RequestBody Societe c){
        societeRepo.save(c);
        return new ResponseEntity<Societe>(c, HttpStatus.CREATED);
    }
    @PutMapping(path="")
    public  ResponseEntity<Societe> update(@RequestBody Societe c){

        try {
            societeRepo.save(c);
            return new ResponseEntity<Societe>(c, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<Societe>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
