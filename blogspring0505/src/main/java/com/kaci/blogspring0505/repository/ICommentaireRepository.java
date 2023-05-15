package com.kaci.blogspring0505.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaci.blogspring0505.entities.Commentaire;

public interface ICommentaireRepository extends JpaRepository<Commentaire, Long> {
    
}
