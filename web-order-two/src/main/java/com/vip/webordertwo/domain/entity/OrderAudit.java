package com.vip.webordertwo.domain.entity;

import lombok.Data;

@Data
public class OrderAudit {
    private Integer orAuditId;

    private Integer orderNum;

    private Integer orAuditState;
}