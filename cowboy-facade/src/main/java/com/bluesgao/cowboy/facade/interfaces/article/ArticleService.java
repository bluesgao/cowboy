package com.bluesgao.cowboy.facade.interfaces.article;

import com.bluesgao.cowboy.facade.entity.Result;
import com.bluesgao.cowboy.facade.entity.article.ArticleDetail;

public interface ArticleService {
    Result<Boolean> publish(ArticleDetail articleDetail);//发布

    void draft();//草稿（用户本地）

    Result<Boolean> delete(Long userId, Long articleId);//删除
}
