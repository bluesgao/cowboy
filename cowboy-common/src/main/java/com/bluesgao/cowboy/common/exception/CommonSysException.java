package com.bluesgao.cowboy.common.exception;

import java.io.Serializable;

// * 通用系统异常
public class CommonSysException extends RuntimeException implements Serializable {
    private ExceptionCodeEnum exceptionCodeEnum;

    public CommonSysException(ExceptionCodeEnum exceptionCodeEnum) {
        super(exceptionCodeEnum.getMessage());
        this.exceptionCodeEnum = exceptionCodeEnum;
    }

    public ExceptionCodeEnum getExceptionCodeEnum() {
        return exceptionCodeEnum;
    }
}
