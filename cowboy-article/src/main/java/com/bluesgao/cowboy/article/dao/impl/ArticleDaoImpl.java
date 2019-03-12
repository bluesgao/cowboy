package com.bluesgao.cowboy.article.dao.impl;

import com.alibaba.fastjson.JSON;
import com.bluesgao.cowboy.article.dao.ArticleDao;
import com.bluesgao.cowboy.article.entity.Article;
import com.mongodb.client.result.UpdateResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

@Slf4j
@Service
public class ArticleDaoImpl implements ArticleDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public boolean save(Article article) {
        log.info("save intput:{}", JSON.toJSONString(article));
        Article result = mongoTemplate.save(article, "article");
        log.info("save output:{}", result);
        if (result != null) {
            return true;
        }
        return false;
    }

    public boolean edit(Article article) {
        log.info("edit intput:{}", JSON.toJSONString(article));
        if (article.getArticleId() == null) {
            return false;
        }

        Query query = new Query();
        query.addCriteria(Criteria.where("articleId").is(article.getArticleId()));

        Update update = new Update();
        //名称
        if (!StringUtils.isEmpty(article.getTitle())) {
            update.set("title", article.getTitle());
        }
        //内容
        if (!StringUtils.isEmpty(article.getContent())) {
            update.set("content", article.getContent());
        }
        //图片
        if (!CollectionUtils.isEmpty(article.getImages())) {
            update.set("images", article.getImages());
        }
        //视频
        if (!CollectionUtils.isEmpty(article.getVideos())) {
            update.set("videos", article.getVideos());
        }
        //标签
        if (!CollectionUtils.isEmpty(article.getTags())) {
            update.set("tags", article.getTags());
        }
        UpdateResult updateResult = mongoTemplate.upsert(query, update, "article");

        log.info("save output:{}", updateResult);
        if (updateResult != null) {
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
