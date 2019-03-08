package com.bluesgao.cowboy.article.service;

import com.alibaba.fastjson.JSON;
import com.bluesgao.cowboy.article.dao.ArticleDetailDao;
import com.bluesgao.cowboy.facade.entity.Result;
import com.bluesgao.cowboy.facade.entity.article.ArticleDetail;
import com.bluesgao.cowboy.facade.interfaces.article.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Slf4j
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDetailDao articleDetailDao;

    public Result<Boolean> post(ArticleDetail articleDetail) {
        log.info("post input:{}", JSON.toJSONString(articleDetail));
        Result result = new Result<Boolean>();
        com.bluesgao.cowboy.article.entity.ArticleDetail input = new com.bluesgao.cowboy.article.entity.ArticleDetail();
        BeanUtils.copyProperties(articleDetail, input);
        Boolean ret = articleDetailDao.save(input);
        if (ret) {
            result.setSuccess(true);
            result.setData(articleDetail);
            result.setErrorCode(0);
            result.setErrorDesc("插入成功");
        } else {
            result.setSuccess(false);
            result.setData(articleDetail);
            result.setErrorCode(1);
            result.setErrorDesc("插入失败");
        }
        log.info("post output:{}", JSON.toJSONString(result));
        return result;
    }

    public void draft() {

    }

    public Result<Boolean> delete(Long userId, Long articleId) {
        return null;
    }

    public Result<List<ArticleDetail>> list(ArticleDetail articleDetail) {
        //TODO
        log.info("list input:{}", JSON.toJSONString(articleDetail));
        Result result = new Result<List<ArticleDetail>>();
        com.bluesgao.cowboy.article.entity.ArticleDetail input = new com.bluesgao.cowboy.article.entity.ArticleDetail();
        BeanUtils.copyProperties(articleDetail, input);
        List<com.bluesgao.cowboy.article.entity.ArticleDetail> articleDetails = articleDetailDao.list(input);
        if (!CollectionUtils.isEmpty(articleDetails)) {
            result.setSuccess(true);
            result.setData(articleDetail);
            result.setErrorCode(0);
            result.setErrorDesc("查询成功");
        } else {
            result.setSuccess(false);
            result.setData(articleDetail);
            result.setErrorCode(1);
            result.setErrorDesc("查询失败");
        }
        log.info("list output:{}", JSON.toJSONString(result));
        return result;
    }
}
