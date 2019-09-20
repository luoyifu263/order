package com.vip.webordertwo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vip.webordertwo.domain.entity.OrderTable;
import org.apache.ibatis.annotations.Param;

/**
 * @author Tang
 */
public interface OrderTableMapper extends BaseMapper<OrderTable> {
    /**
     * 修改订单状态
     * @param orderNum
     * @param status
     * @return
     */
    int updateStatusByOrderNum(@Param("orderNum") int orderNum, @Param("status") int status);
}