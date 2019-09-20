package com.vip.webordertwo.utils.common;

/**
 * @author zhangwei
 */

public enum StatusTypeEnum {
    /**
     * 200为成功
     * 404为错误信息
     */
    SUCCESS(200,"success"),
    ERROR(404,"error");

    private String msg;
    private int status;

    public String getMsg(){
        return msg;
    }
    public int getStatus(){
        return status;
    }

    StatusTypeEnum(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

}
