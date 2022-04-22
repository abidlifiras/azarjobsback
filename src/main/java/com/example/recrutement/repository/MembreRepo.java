package com.example.recrutement.repository;

import com.example.recrutement.domain.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MembreRepo extends JpaRepository<Membre,Integer> {
    Optional<Membre> findByUsername(String username);
}
