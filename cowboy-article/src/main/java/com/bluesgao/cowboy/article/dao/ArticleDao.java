package com.bluesgao.cowboy.article.dao;

import com.bluesgao.cowboy.article.entity.Article;

import java.util.List;

public interface ArticleDao {
    boolean save(Article article);
    List<Article> list(Article article);
}
