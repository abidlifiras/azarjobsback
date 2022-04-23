package com.example.recrutement.controller;

import com.example.recrutement.domain.Membre;
import com.example.recrutement.repository.MembreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*" )
@RestController
@RequestMapping(path="/users")
public class MembreControl {

    @Autowired
    private final MembreRepo membreRepo;

    public MembreControl(MembreRepo membreRepo) {
        this.membreRepo = membreRepo;
    }

    //affiche liste des comptes condidats

    @GetMapping(path="")

    public List<Membre> touslescomptes()  {
        return  membreRepo.findAll();
    }

    //affiche un compte selon email

    @GetMapping(path="/{email}")

    public ResponseEntity<Membre> findByEmail(@PathVariable("email") String email) {
        Optional<Membre> resultat =  membreRepo.findByEmail(email);
        if (((Optional<?>) resultat).isPresent())
            return new ResponseEntity<>(resultat.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    //ajout compte

    @PostMapping(path="")
    public  ResponseEntity<Membre> create( @RequestBody Membre c){
        membreRepo.save(c);
        return new ResponseEntity<Membre>(c, HttpStatus.CREATED);
    }
    @PutMapping(path="/{username}")
    public Membre update(@PathVariable("username") String name, @RequestBody Membre c){

        return membreRepo.findByUsername(name)
                .map(employee -> {
                    employee.setEmail(c.getEmail());
                    employee.setPassword(c.getPassword());
                    employee.setCV(c.getCV());
                    employee.setCivility(c.getCivility());
                    return membreRepo.save(employee);
                })
                .orElseGet(() -> {
                    c.setUsername(name);
                    return membreRepo.save(c);
                });
    }

}
