package com.bluesgao.cowboy.facade.entity.article;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
/**
 * 文章统计信息
 */
public class ArticleStatistic implements Serializable {
    private long articleId;//文章id
    private long view;//查看
    private long like;//喜欢
    private long forward;//转发
    private long collect;//收藏
    private long comment;//评论
}
