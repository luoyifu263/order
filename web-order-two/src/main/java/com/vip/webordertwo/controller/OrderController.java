package com.vip.webordertwo.controller;

import com.vip.webordertwo.domain.entity.OrderReturn;
import com.vip.webordertwo.mapper.UserMapper;
import com.vip.webordertwo.service.OrderService;
import com.vip.webordertwo.utils.handler.ResultParameter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Tang
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 交易成功接口
     * @param orderId
     * @return
     */
    @RequestMapping("/done")
    @ResultParameter
    public Object dealsAreDone(int orderId){

        return orderService.fulfillDeal(orderId);

    }

    /**
     * 卖家同意退款
     * @param orderNum
     * @return
     */
    @RequestMapping("/approve")
    @ResultParameter
    public Object approve(int orderNum){

        return orderService.verifiedOrder(orderNum);

    }

    /**
     * 卖家不同意退款
     * @param orderNum
     * @return
     */
    @RequestMapping("/refuse")
    @ResultParameter
    public Object refuse(int orderNum){

        return orderService.retuseOrder(orderNum);

    }

    /**
     * 买家申请退款
     * @param orderReturn
     * @return
     */
    @RequestMapping("/applyQuit")
    @ResultParameter
    public Object applyQuit(OrderReturn orderReturn){
        return orderService.applyQuit(orderReturn);
    }
}
