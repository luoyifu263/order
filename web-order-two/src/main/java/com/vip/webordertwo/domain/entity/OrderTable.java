package com.vip.webordertwo.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class OrderTable {
    private Integer orderId;

    private Integer orderNum;

    private Integer shopId;

    private Integer uid;

    private Integer merchantId;

    private Integer idPay;

    private Date orderTime;

    private Date shipmentsTime;

    private Date returnTime;

    private Integer isReturn;

    private Integer orderStatus;
}