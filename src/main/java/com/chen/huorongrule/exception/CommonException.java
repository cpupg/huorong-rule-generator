package com.chen.huorongrule.exception;

/**
 * 通用异常，将检查异常转换为运行时异常，避免修改代码后需要改签名。
 *
 * @author chen
 */
public class CommonException extends RuntimeException {
    public CommonException(String message) {
        super(message);
    }

    public CommonException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommonException(Throwable cause) {
        super(cause);
    }

    protected CommonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
