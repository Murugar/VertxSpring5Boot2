package com.iqmsoft.vertx.services;

import org.springframework.stereotype.Service;

import com.iqmsoft.vertx.entities.Article;

import java.util.ArrayList;
import java.util.List;


@Service
public class ArticleService {

    final List<Article> articles = new ArrayList<>();

    public ArticleService() {
        articles.add(new Article(0L, "Article 1"));
        articles.add(new Article(1L, "Article 2"));
        articles.add(new Article(1L, "Article 3"));
        articles.add(new Article(1L, "Article 4"));
        articles.add(new Article(1L, "Article 5"));
        articles.add(new Article(1L, "Article 6"));
    }

    public List<Article> getAllArticles() {
        return articles;
    }
}
