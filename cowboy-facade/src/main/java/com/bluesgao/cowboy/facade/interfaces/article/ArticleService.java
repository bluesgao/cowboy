package com.bluesgao.cowboy.facade.interfaces.article;

import com.bluesgao.cowboy.facade.entity.CommonResult;
import com.bluesgao.cowboy.facade.entity.article.ArticleRich;
import com.bluesgao.cowboy.facade.entity.article.ArticleVo;

import java.util.List;

public interface ArticleService {
    CommonResult<Boolean> post(ArticleVo articleVo);//发布

    void draft();//草稿（用户客户端实现比较合理）

    CommonResult<Boolean> delete(Long userId, Long articleId);//删除

    CommonResult<List<ArticleVo>> list(ArticleVo articleVo);//列表

    CommonResult<ArticleRich> detail(Long articleId);//列表
}
