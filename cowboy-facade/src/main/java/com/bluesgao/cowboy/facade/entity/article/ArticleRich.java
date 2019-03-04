package com.bluesgao.cowboy.facade.entity.article;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class ArticleRich implements Serializable {
    private ArticleBasic articleBasic;
    private ArticleDetail articleDetail;
    private ArticleComment articleComment;
    private ArticleStatistic articleStatistic;
}
