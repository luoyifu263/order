package com.vip.webordertwo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vip.webordertwo.domain.entity.OrderReturn;

public interface OrderReturnMapper extends BaseMapper<OrderReturn> {
    int deleteByPrimaryKey(Integer orReturnId);

    int insert(OrderReturn record);

    int insertSelective(OrderReturn record);

    OrderReturn selectByPrimaryKey(Integer orReturnId);

    int updateByPrimaryKeySelective(OrderReturn record);

    int updateByPrimaryKey(OrderReturn record);
}