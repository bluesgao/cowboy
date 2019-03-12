package com.bluesgao.cowboy.facade.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
/**
 * 通用结果
 */
public class CommonResult<T> implements Serializable {
    private int code;//响应码
    private String msg;//响应码描述
    private T data;//返回数据
}
