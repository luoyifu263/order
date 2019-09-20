package com.vip.webordertwo.exep;


import com.vip.webordertwo.common.ErrorResult;
import com.vip.webordertwo.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;


/**
 * @author zhangwei
 */

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    // 全局的错误的异常处理
    //

    /**
     * oracle  存储过程  维护
     * 数据库层异常
     * 业务层的异常
     */
    //    value处理那个异常
    @ExceptionHandler(MessageCenterException.class)
    public Result baseException(HttpServletRequest request, MessageCenterException ex) {
        log.error(ex.getMessage());
        return ErrorResult.error(ex.getMessage());
    }

}
