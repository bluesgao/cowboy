package com.bluesgao.cowboy.article.service;

import com.alibaba.fastjson.JSON;
import com.bluesgao.cowboy.article.dao.ArticleDao;
import com.bluesgao.cowboy.article.entity.Article;
import com.bluesgao.cowboy.facade.entity.CommonResult;
import com.bluesgao.cowboy.facade.entity.article.ArticleRich;
import com.bluesgao.cowboy.facade.entity.article.ArticleVo;
import com.bluesgao.cowboy.facade.interfaces.article.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    public CommonResult<Boolean> post(ArticleVo articleVo) {
        log.info("post input:{}", JSON.toJSONString(articleVo));
        CommonResult commonResult = new CommonResult<Boolean>();
        Article input = new Article();
        BeanUtils.copyProperties(articleVo, input);
        Boolean ret = articleDao.save(input);
        if (ret) {
            commonResult.setCode(0);
            commonResult.setData(articleVo);
            commonResult.setMsg("发布成功");
        } else {
            commonResult.setData(articleVo);
            commonResult.setCode(1);
            commonResult.setMsg("发布失败");
        }
        log.info("post output:{}", JSON.toJSONString(commonResult));
        return commonResult;
    }

    public CommonResult<Boolean> edit(ArticleVo articleVo) {
        log.info("edit input:{}", JSON.toJSONString(articleVo));
        CommonResult commonResult = new CommonResult<Boolean>();
        Article input = new Article();
        BeanUtils.copyProperties(articleVo, input);
        Boolean ret = articleDao.edit(input);
        if (ret) {
            commonResult.setData(articleVo);
            commonResult.setCode(0);
            commonResult.setMsg("编辑成功");
        } else {
            commonResult.setData(articleVo);
            commonResult.setCode(1);
            commonResult.setMsg("编辑失败");
        }
        log.info("edit output:{}", JSON.toJSONString(commonResult));
        return commonResult;
    }

    public void draft() {

    }

    public CommonResult<Boolean> delete(Long userId, Long articleId) {
        return null;
    }

    public CommonResult<List<ArticleVo>> list(ArticleVo articleVo) {
        //TODO
        log.info("list input:{}", JSON.toJSONString(articleVo));
        CommonResult commonResult = new CommonResult<List<ArticleVo>>();
        Article input = new Article();
        BeanUtils.copyProperties(articleVo, input);
        List<Article> articles = articleDao.list(input);
        log.info("list articles:{}", JSON.toJSONString(articles));
        commonResult.setData(articles);
        commonResult.setCode(0);
        commonResult.setMsg("查询成功");

        log.info("list output:{}", JSON.toJSONString(commonResult));
        return commonResult;
    }

    public CommonResult<ArticleRich> detail(Long articleId) {
        log.info("detail input:{}", articleId);
        return null;
    }
}
