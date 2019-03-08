package com.bluesgao.cowboy.article.dao;

import com.bluesgao.cowboy.article.entity.ArticleDetail;

import java.util.List;

public interface ArticleDetailDao {
    boolean save(ArticleDetail articleDetail);
    List<ArticleDetail> list(ArticleDetail articleDetail);
}
