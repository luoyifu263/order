package com.vip.webordertwo.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class OrderReturn {
    private Integer orReturnId;

    private Integer orderNum;

    private Integer orReturnNum;

    private Integer reSiteId;

    private Integer orReturnMoney;

    private String orReturnReason;

    private String orReturnType;

    private Integer isOutShop;

    private Date orReturnTime;
}