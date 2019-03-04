package com.bluesgao.cowboy.common.exception;

import java.io.Serializable;

/*
 * 全局的异常状态码 和 异常描述
 *
 * PS:异常码一共由8位组成，前4位为固定前缀
 */
public enum ExceptionCodeEnum implements Serializable {
    /**
     * 通用异常
     */
    UNKNOW_ERROR(ExceptionCodePrefix.ComExpPrefix + "0000", "未知异常"),
    ERROR_404(ExceptionCodePrefix.ComExpPrefix + "0001", "没有该接口"),
    PARAM_NULL(ExceptionCodePrefix.ComExpPrefix + "0002", "参数为空"),
    NO_REPEAT(ExceptionCodePrefix.ComExpPrefix + "0003", "请勿重复提交"),
    SESSION_NULL(ExceptionCodePrefix.ComExpPrefix + "0004", "请求头中SessionId不存在"),
    HTTP_REQ_METHOD_ERROR(ExceptionCodePrefix.ComExpPrefix + "0005", "HTTP请求方法不正确"),
    JSONERROR(ExceptionCodePrefix.ComExpPrefix + "0006", "JSON解析异常");


    /**
     * 其他模块异常
     */

    private String code;
    private String message;

    private ExceptionCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    ExceptionCodeEnum() {
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}