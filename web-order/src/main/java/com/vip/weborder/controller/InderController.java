package com.vip.weborder.controller;

import com.vip.weborder.domain.entity.User;
import com.vip.weborder.mapper.UserMapper;
import com.vip.weborder.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class InderController {
    @Resource
    UserMapper userMapper;
    @Resource
    OrderService orderService;
    @RequestMapping("/test")
    public List<User> test(){
        return orderService.test();
    }

    @RequestMapping("/test2")
    public String test2(){
        return null;
    }
    @RequestMapping("/test3")
    public User test3(){
        return userMapper.selectById(3);
    }

}
