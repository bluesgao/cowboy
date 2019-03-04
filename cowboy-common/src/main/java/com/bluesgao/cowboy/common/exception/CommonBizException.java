package com.bluesgao.cowboy.common.exception;

import java.io.Serializable;

// * 通用业务异常（由异常状态码区分不同的业务异常）
public class CommonBizException extends RuntimeException implements Serializable {
    private ExceptionCodeEnum exceptionCodeEnum;

    public CommonBizException(ExceptionCodeEnum exceptionCodeEnum) {
        super(exceptionCodeEnum.getMessage());
        this.exceptionCodeEnum = exceptionCodeEnum;
    }

    public ExceptionCodeEnum getExceptionCodeEnum() {
        return exceptionCodeEnum;
    }
}
