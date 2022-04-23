package com.example.recrutement.repository;

import com.example.recrutement.domain.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OffreRepo extends JpaRepository<Offre,Integer> {
        Optional<Offre> findByTitre(String titre);
        Optional<Offre> findById(int id);
}
