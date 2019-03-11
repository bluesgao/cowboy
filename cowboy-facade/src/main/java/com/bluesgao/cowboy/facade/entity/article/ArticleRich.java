package com.bluesgao.cowboy.facade.entity.article;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class ArticleRich implements Serializable {
    private ArticleVo articleVo;
    private ArticleCommentVo articleCommentVo;
    private ArticleStatisticVo articleStatisticVo;
}
