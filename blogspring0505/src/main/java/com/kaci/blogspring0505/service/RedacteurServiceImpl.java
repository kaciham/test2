package com.kaci.blogspring0505.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaci.blogspring0505.entities.Article;
import com.kaci.blogspring0505.repository.IArticleRepository;

import lombok.AllArgsConstructor;

@Service // Service est obligatoire
@AllArgsConstructor // All Args ou Autowired
public class RedacteurServiceImpl implements IRedacteurService {

    @Autowired
    private IArticleRepository iArticleRepository;

    @Override
    public List<Article> listeArticle() {
        return iArticleRepository.findAll();
    }

    @Override
    public Article afficheArticle(Long idArticle) {
        return iArticleRepository.findByIdArticle(idArticle);
    }

}
