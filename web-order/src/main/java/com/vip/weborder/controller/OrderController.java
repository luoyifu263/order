package com.vip.weborder.controller;

import com.vip.weborder.mapper.OrderMapper;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Resource
    OrderMapper orderMapper;

}
