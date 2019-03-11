package com.bluesgao.cowboy.article.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@ToString
@Setter
@Getter
/**
 * 文章评论
 */
public class ArticleComment implements Serializable {
    private long id;//评论id
    private long articleId;//评论文章id
    private long userId;//评论用户id
    private String info;//评论内容
    private Date commentTime;//评论时间
}
