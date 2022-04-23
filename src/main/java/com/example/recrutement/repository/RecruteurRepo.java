package com.example.recrutement.repository;

import com.example.recrutement.domain.Membre;
import com.example.recrutement.domain.Recruteur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RecruteurRepo extends JpaRepository<Recruteur,Integer> {
    Optional<Membre> findByEmail(String email);
}
