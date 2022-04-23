package com.example.recrutement.controller;

import com.example.recrutement.domain.Offre;
import com.example.recrutement.domain.Postuler;
import com.example.recrutement.repository.PostulerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*" )
@RestController
@RequestMapping(path="/postule")
public class PostulerControll {

    @Autowired
    private final PostulerRepo postulerRepo;

    public PostulerControll(PostulerRepo postulerRepo) {
        this.postulerRepo = postulerRepo;
    }

    @GetMapping("")
    public List<Postuler> getall()  {
        return  postulerRepo.findAll();
    }

    @PostMapping("")
    public ResponseEntity<Postuler> create(@RequestBody Postuler c) {
        postulerRepo.save(c);
        return new ResponseEntity<Postuler>(c, HttpStatus.CREATED);
    }

    @PutMapping(path = "")
    public  ResponseEntity<Postuler> update(@RequestBody Postuler c){
        try {
            postulerRepo.save(c);
            return new ResponseEntity<Postuler>(c, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<Postuler>(HttpStatus.NOT_ACCEPTABLE);
        }

    }

}
