package com.kaci.blogspring0505.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaci.blogspring0505.entities.Compte;

public interface ICompteRepository extends JpaRepository<Compte, Long>{   
    
}
