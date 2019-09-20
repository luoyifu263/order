package com.vip.webordertwo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vip.webordertwo.domain.entity.OrderAudit;
import org.apache.ibatis.annotations.Param;

public interface OrderAuditMapper extends BaseMapper<OrderAudit> {

    /**
     * 修改状态通过num
     * @param orderNum
     * @param orderStatus
     * @return
     */
    int updateByOrderNum(@Param("orderNum") int orderNum, @Param("orderStatus") int orderStatus);

    /**
     * 查找状态
     * @param orderNum
     * @return
     */
    OrderAudit seletAuditState(int orderNum);
}