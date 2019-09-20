package com.vip.webordertwo.service.impl;

import com.vip.webordertwo.mapper.OrderAuditMapper;
import com.vip.webordertwo.service.OrderService;
import com.vip.webordertwo.utils.Enum.OrderStatus;
import com.vip.webordertwo.utils.exep.MessageCenterException;
import com.vip.webordertwo.utils.exep.WebExceptionEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Tang
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderAuditMapper orderAuditMapper;


    @Override
    public int fulfillDeal(int orderId){

        try {
            return orderAuditMapper.updateByOrderNum(orderId, OrderStatus.FULFILL.getCode());
        }catch (MessageCenterException e){
            throw new MessageCenterException(WebExceptionEnum.SERVICE_INVOKE_ERROR);
        }
    }
}
