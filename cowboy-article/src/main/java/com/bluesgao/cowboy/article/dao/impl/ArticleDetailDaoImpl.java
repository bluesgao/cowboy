package com.bluesgao.cowboy.article.dao.impl;

import com.bluesgao.cowboy.article.dao.ArticleDetailDao;
import com.bluesgao.cowboy.article.entity.ArticleDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@Slf4j
public class ArticleDetailDaoImpl implements ArticleDetailDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public boolean save(ArticleDetail articleDetail) {
        log.info("save intput:{}", articleDetail);
        ArticleDetail result = mongoTemplate.save(articleDetail, "articleDetail");
        if (result != null){
            return true;
        }
        return false;
    }

    public List<ArticleDetail> list() {
        return mongoTemplate.findAll(ArticleDetail.class, "articleDetail");
    }
}
