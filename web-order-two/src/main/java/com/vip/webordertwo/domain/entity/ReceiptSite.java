package com.vip.webordertwo.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class ReceiptSite {
    private Integer reSiteId;

    private Integer uid;

    private String reSiteName;

    private String reSitePhone;

    private String reSiteSite;

    private Date reSiteTime;

    private Integer isDefault;
}