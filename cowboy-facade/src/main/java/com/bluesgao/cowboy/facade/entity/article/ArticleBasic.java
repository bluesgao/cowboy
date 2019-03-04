package com.bluesgao.cowboy.facade.entity.article;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@ToString
@Setter
@Getter
/**
 * 文章基本信息
 */
public class ArticleBasic implements Serializable {
    private long id;//文章id
    private String title;//文章名称
    private int status;//文章状态
    private String mainImage;//文章主图
    private String authorName;//文章作者
    private long authorId;//文章作者
    private Date publishTime;//文章发布时间
    private List<String> tags;//文章标签
}
