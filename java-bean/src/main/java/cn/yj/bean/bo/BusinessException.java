package cn.yj.bean.bo;

import dispose.TextDispose;

import java.io.Serializable;

/**
 * 错误处理类
 */
public class BusinessException extends Exception implements Serializable {

    private static final String DEFAULT_ERROR_MSG = "操作失败,请稍后重试";

    public BusinessException(String message) {
        super(TextDispose.isEmpty(message) ? DEFAULT_ERROR_MSG : message);
    }

    public BusinessException(Exception exception) {
        super(DEFAULT_ERROR_MSG, exception);
    }

    public BusinessException(String message, Exception exception) {
        super(TextDispose.isEmpty(message) ? DEFAULT_ERROR_MSG : message, exception);
    }

    public BusinessException() {
        super(DEFAULT_ERROR_MSG);
    }
}
