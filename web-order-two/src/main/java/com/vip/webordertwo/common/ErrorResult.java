package com.vip.webordertwo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangwei
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResult implements Result {
    private int status;
    private StatusTypeEnum type;
    private String msg;



    public static ErrorResult error(int status, Exception ex) {
        return new ErrorResult(StatusTypeEnum.ERROR.getStatus(),StatusTypeEnum.ERROR, ex.getMessage());
    }
    public static ErrorResult error() {
        return new ErrorResult(StatusTypeEnum.ERROR.getStatus(), StatusTypeEnum.ERROR,null);
    }

    public static ErrorResult error(String mag) {
        return new ErrorResult(StatusTypeEnum.ERROR.getStatus(), StatusTypeEnum.ERROR,mag);
    }
}
