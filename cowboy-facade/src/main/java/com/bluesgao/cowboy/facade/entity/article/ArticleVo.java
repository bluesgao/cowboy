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
 * 文章详情
 */
public class ArticleVo implements Serializable {

    private Long articleId;//文章id
    private String title;//文章名称
    private String authorName;//文章作者名称
    private Long authorId;//文章作者id
    private Date publishTime;//文章发布时间
    private List<TagVo> tags;//文章标签
    private String content;//具体内容
    private List<String> images;//图片
    private List<String> videos;//视频
}
