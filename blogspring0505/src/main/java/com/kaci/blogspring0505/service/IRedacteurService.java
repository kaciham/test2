package com.kaci.blogspring0505.service;

import java.util.List;

import com.kaci.blogspring0505.entities.Article;
// création méthode rédacteur
public interface IRedacteurService {
    List<Article> listeArticle();
    Article afficheArticle(Long idArticle);
}

