package com.vip.webordertwo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vip.webordertwo.domain.entity.OrderExpress;
import org.apache.ibatis.annotations.Param;

public interface OrderExpressMapper extends BaseMapper<OrderExpress> {
    /**
     * 查询收货状态
     * @param orderNum
     * @return
     */
    OrderExpress selectState(@Param("orderNum") int orderNum);
}