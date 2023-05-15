package com.kaci.blogspring0505.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaci.blogspring0505.entities.Article;
import java.util.List;


public interface IArticleRepository extends JpaRepository<Article, Long>{
    Article findByIdArticle(Long idArticle);
}
