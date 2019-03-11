package com.bluesgao.cowboy.article.dao.impl;

import com.bluesgao.cowboy.article.dao.ArticleDao;
import com.bluesgao.cowboy.article.entity.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Slf4j
@Service
public class ArticleDaoImpl implements ArticleDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public boolean save(Article article) {
        log.info("save intput:{}", article);
        Article result = mongoTemplate.save(article, "article");
        log.info("save output:{}", result);
        if (result != null) {
            return true;
        }
        return false;
    }

    public List<Article> list(Article article) {
        //TODO
        Query query = new Query();

        if (!StringUtils.isEmpty(article.getAuthorName())) {
            Criteria criteria = Criteria.where("authorName").is(article.getAuthorName());
            query.addCriteria(criteria);
        }
        List<Article> articles = mongoTemplate.find(query, Article.class);
        return articles;
    }
}
