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
public class Result<T> implements Serializable {
    private boolean isSuccess;//执行成功标志
    private int errorCode;//错误码
    private int errorDesc;//错误码描述
    private T data;//返回数据
}
