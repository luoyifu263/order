package com.vip.webordertwo.service;

import com.vip.webordertwo.domain.entity.OrderReturn;

/**
 * @author Tang
 */
public interface OrderService {

    /**
     * 交易成功接口
     *
     * @param orderId
     * @return
     */
    int fulfillDeal(int orderId);


    /**
     * 卖家同意
     *
     * @param orderNum
     * @return
     */
    int verifiedOrder(int orderNum);

    /**
     * 卖家拒绝
     *
     * @param orderNum
     * @return
     */
    int retuseOrder(int orderNum);

    /**
     * 申请退款
     *
     * @param orderReturn
     * @return
     */
    int applyQuit(OrderReturn orderReturn);
}
