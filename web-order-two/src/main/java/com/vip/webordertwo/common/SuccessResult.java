package com.vip.webordertwo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangwei
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessResult<T> implements Result<T> {
    private StatusTypeEnum status;
    private T data;

    public static SuccessResult succes() {
        return new SuccessResult<>(StatusTypeEnum.SUCCESS, null);
    }

    public static <T> SuccessResult succes(T data) {
        return new SuccessResult<>(StatusTypeEnum.SUCCESS, data);
    }

}
