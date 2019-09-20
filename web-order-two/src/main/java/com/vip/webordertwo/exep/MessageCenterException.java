package com.vip.webordertwo.exep;

public class MessageCenterException extends RuntimeException {

    private static final long serialVersionUID = -8581672033133636908L;

    //异常状态枚举类型
    private WebExceptionEnum exceptionEnum;

    //set方法
    private void setExceptionEnum(WebExceptionEnum exceptionEnum){
        this.exceptionEnum = exceptionEnum;
    }

    //无参构造方法
    public WebExceptionEnum getExceptionEnum(){
        return exceptionEnum;
    }

    //获取枚举异常信息
    public MessageCenterException(WebExceptionEnum exceptionEnum){
        super(exceptionEnum.getMassage());

        this.setExceptionEnum(exceptionEnum);
    }

    //获取异常信息
    @Override
    public String getMessage() {
        return exceptionEnum.getMassage();
    }
}
