package com.vip.webordertwo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vip.webordertwo.domain.entity.ReceiptSite;

public interface ReceiptSiteMapper extends BaseMapper<ReceiptSite> {
    int deleteByPrimaryKey(Integer reSiteId);

    int insert(ReceiptSite record);

    int insertSelective(ReceiptSite record);

    ReceiptSite selectByPrimaryKey(Integer reSiteId);

    int updateByPrimaryKeySelective(ReceiptSite record);

    int updateByPrimaryKey(ReceiptSite record);
}