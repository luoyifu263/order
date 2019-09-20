package com.vip.webordertwo.utils.exep;

/**
 * @author Tang
 */

public enum WebExceptionEnum {
    /**
     * SYS_ERROR      系统文件错误
     * UNKNOWN_ERROR  未知系统错误
     * SERVICE_INVOKE_ERROR   服务器调用错误
     * ILLEGAL_ARGS   传入参数不正确
     */


    SYS_ERROR("SYS_ERROR", "系统错误请重试"),
    UNKNOWN_ERROR("UNKNOWN_ERROR", "未知系统错误"),
    SERVICE_INVOKE_ERROR("SERVICE_INVOKE_ERROR", "服务器调用错误"),
    ILLEGAL_ARGS("ILLEGAL_ARGS", "参数效验失败");


    private String exception;
    private String massage;

    WebExceptionEnum(String exception, String massage) {
        this.exception = exception;
        this.massage = massage;
    }

    public String getException() {
        return exception;
    }

    public String getMassage() {
        return massage;
    }


    public static WebExceptionEnum getWebException(String exception) {
        for (WebExceptionEnum results : WebExceptionEnum.values()) {
            if (results.getException().equals(exception)) {
                return results;
            }
        }
        return null;
    }
}
