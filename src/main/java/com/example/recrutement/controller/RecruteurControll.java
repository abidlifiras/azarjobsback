package com.example.recrutement.controller;

import com.example.recrutement.domain.Membre;
import com.example.recrutement.domain.Recruteur;
import com.example.recrutement.repository.RecruteurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*" )
@RestController
@RequestMapping(path="/recruteur")
public class RecruteurControll {

    @Autowired
    private final RecruteurRepo recruteurRepo;


    public RecruteurControll(RecruteurRepo recruteurRepo) {
        this.recruteurRepo = recruteurRepo;
    }
    @GetMapping(path="/affichecompte")

    public List<Recruteur> touslescomptes()  {
        return  recruteurRepo.findAll();
    }

    //ajout compte

    @PostMapping(path="/ajout")
    public  ResponseEntity<Recruteur> create( @RequestBody Recruteur c){
        recruteurRepo.save(c);
        return new ResponseEntity<Recruteur>(c, HttpStatus.CREATED);
    }
    @PutMapping(path="/update")
    public  ResponseEntity<Recruteur> update(@RequestBody Recruteur c){

        try {
            recruteurRepo.save(c);
            return new ResponseEntity<Recruteur>(c, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<Recruteur>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

}
