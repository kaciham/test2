package com.kaci.blogspring0505.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kaci.blogspring0505.entities.Article;
import com.kaci.blogspring0505.service.IRedacteurService;


// @Controller // Utliser Thymleaf (jsp)
@RestController // API - récupérer les données en format JSON
public class RedacteurController {

    @Autowired // injection de dépendance
    private IRedacteurService iRedacteurService;

    @GetMapping("/liste") // liste des articles
    public List<Article> listeArticle() {
        return iRedacteurService.listeArticle();
    }

    @GetMapping("/article/{idArticle}") // afficher les articles 
    public Article afficheArticle(@PathVariable Long idArticle) {
        return iRedacteurService.afficheArticle(idArticle);
    }
}
