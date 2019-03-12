package com.bluesgao.cowboy.article.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 标签
 */
@Setter
@Getter
@ToString
public class Tag implements Serializable {
    private Long id;//标签id
    private String tagName;//标签名称
    private int category;//标签分类
    private int state;//状态
}
