package com.vip.webordertwo.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class OrderExpress {
    private Integer orExpressId;

    private Integer orderNum;

    private String orExpressNum;

    private Integer reSiteId;

    private Date orExpressTime;

    private Date orExpressDeliveryTime;

    private Integer orExpressState;
}