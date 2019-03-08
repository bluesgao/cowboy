package com.bluesgao.cowboy.article.dao.impl;

import com.bluesgao.cowboy.article.dao.ArticleDetailDao;
import com.bluesgao.cowboy.article.entity.ArticleDetail;
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
public class ArticleDetailDaoImpl implements ArticleDetailDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public boolean save(ArticleDetail articleDetail) {
        log.info("save intput:{}", articleDetail);
        ArticleDetail result = mongoTemplate.save(articleDetail, "articleDetail");
        log.info("save output:{}", result);
        if (result != null) {
            return true;
        }
        return false;
    }

    public List<ArticleDetail> list(ArticleDetail articleDetail) {
        //TODO
        Query query = new Query();

        if (!StringUtils.isEmpty(articleDetail.getAuthorName())) {
            Criteria criteria = Criteria.where("authorName").is(articleDetail.getAuthorName());
            query.addCriteria(criteria);
        }
        List<ArticleDetail> articleDetails = mongoTemplate.find(query, ArticleDetail.class);
        return articleDetails;
    }
}
