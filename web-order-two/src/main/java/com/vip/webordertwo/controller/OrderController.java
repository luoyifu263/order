package com.vip.webordertwo.controller;

import com.vip.webordertwo.mapper.UserMapper;
import com.vip.webordertwo.service.OrderService;
import com.vip.webordertwo.utils.handler.ResultParameter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/done")
    @ResultParameter
    public Object dealsAreDone(int orderId){

        return orderService.fulfillDeal(orderId);

    }
}
