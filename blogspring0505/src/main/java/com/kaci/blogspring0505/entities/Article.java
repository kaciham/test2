package com.kaci.blogspring0505.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticle;
    private boolean _public;
    private boolean modere;
    private String titre;
    private String contenu;
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @ManyToOne
    // //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY) //optionnel: évite d'afficher systématiquement le compte
    private Compte compte;
}
