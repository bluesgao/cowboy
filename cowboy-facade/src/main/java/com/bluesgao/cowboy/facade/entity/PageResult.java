package com.bluesgao.cowboy.facade.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
/**
 * 分页结果
 */
public class PageResult<T> implements Serializable {
    private int pageNum;//当前页码
    private int pageSize;//每页数量
    private long total;//总记录数
    private int pages;//总页数
    private List<T> list;//结果集
}
