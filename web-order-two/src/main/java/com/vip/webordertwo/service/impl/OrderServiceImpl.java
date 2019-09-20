package com.vip.webordertwo.service.impl;


import com.vip.webordertwo.domain.entity.OrderAudit;
import com.vip.webordertwo.domain.entity.OrderExpress;
import com.vip.webordertwo.domain.entity.OrderReturn;
import com.vip.webordertwo.mapper.OrderAuditMapper;
import com.vip.webordertwo.mapper.OrderExpressMapper;
import com.vip.webordertwo.mapper.OrderReturnMapper;
import com.vip.webordertwo.mapper.OrderTableMapper;
import com.vip.webordertwo.service.OrderService;
import com.vip.webordertwo.utils.Enum.OrderStatus;
import com.vip.webordertwo.utils.exep.MessageCenterException;
import com.vip.webordertwo.utils.exep.WebExceptionEnum;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Tang
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderAuditMapper orderAuditMapper;

    @Resource
    private OrderExpressMapper orderExpressMapper;

    @Resource
    private OrderTableMapper orderTableMapper;

    @Resource
    private OrderReturnMapper orderReturnMapper;

    @Override
    public int fulfillDeal(int orderId) {

        try {
            return orderAuditMapper.updateByOrderNum(orderId, OrderStatus.FULFILL.getCode());
        } catch (MessageCenterException e) {
            throw new MessageCenterException(WebExceptionEnum.SERVICE_INVOKE_ERROR);
        }
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)

    public int verifiedOrder(int orderNum) {
        OrderAudit orderAudit = orderAuditMapper.seletAuditState(orderNum);

        if (orderAudit.getOrAuditState() != OrderStatus.APPLY_FORRE_FUND.getCode()) {
            throw new MessageCenterException(WebExceptionEnum.ILLEGAL_ARGS);
        }

        //查看是否签收
        OrderExpress orderExpress = orderExpressMapper.selectState(orderNum);

        //判断是否签收做出不同决定
        if (orderExpress.getOrExpressState() == 0) {
            int auditResult = orderAuditMapper.updateByOrderNum(orderNum, OrderStatus.DEAL_CANCEL.getCode());
            int tableResult = orderTableMapper.updateStatusByOrderNum(orderNum, 0);

            if (auditResult == 0 || tableResult == 0) {
                throw new MessageCenterException(WebExceptionEnum.SYS_ERROR);
            }

        } else if (orderExpress.getOrExpressState() == 1) {

            int auditResult = orderAuditMapper.updateByOrderNum(orderNum, OrderStatus.BUYES_RETURNS.getCode());

            if (auditResult == 0) {
                throw new MessageCenterException(WebExceptionEnum.SYS_ERROR);
            }

        }
        return 1;
    }

    @Override
    public int retuseOrder(int orderNum) {
        OrderAudit orderAudit = orderAuditMapper.seletAuditState(orderNum);

        if (orderAudit.getOrAuditState() != OrderStatus.APPLY_FORRE_FUND.getCode()) {
            throw new MessageCenterException(WebExceptionEnum.ILLEGAL_ARGS);
        }

        return orderAuditMapper.updateByOrderNum(orderNum, OrderStatus.VENDOY_RETUSE.getCode());
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public int applyQuit(OrderReturn orderReturn) {
        OrderAudit orderAudit = orderAuditMapper.seletAuditState(orderReturn.getOrderNum());

        if (orderAudit.getOrAuditState() == OrderStatus.DEAL.getCode()) {
            throw new MessageCenterException(WebExceptionEnum.ILLEGAL_ARGS);
        }

        int insert = orderReturnMapper.insert(orderReturn);

        int auditResult = orderAuditMapper.updateByOrderNum(orderReturn.getOrderNum(), OrderStatus.APPLY_FORRE_FUND.getCode());

        if (insert == 0 || auditResult == 0) {
            throw new MessageCenterException(WebExceptionEnum.ILLEGAL_ARGS);
        }

        return 1;
    }


}
