package com.bluesgao.cowboy.facade.interfaces.article;

import com.bluesgao.cowboy.facade.entity.Result;
import com.bluesgao.cowboy.facade.entity.article.ArticleDetail;

import java.util.List;

public interface ArticleService {
    Result<Boolean> post(ArticleDetail articleDetail);//发布

    void draft();//草稿（用户客户端实现比较合理）

    Result<Boolean> delete(Long userId, Long articleId);//删除

    Result<List<ArticleDetail>> list(ArticleDetail articleDetail);//列表
}
