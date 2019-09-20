package com.vip.webordertwo.handler;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

/**
 * @author Tang
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@Mapping
@Documented
public @interface ResultParameter {
    boolean isResult() default true;
}
