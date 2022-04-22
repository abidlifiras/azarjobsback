package com.example.recrutement.repository;

import com.example.recrutement.domain.Membre;
import com.example.recrutement.domain.Societe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SocieteRepo extends JpaRepository<Societe,Integer> {
}

