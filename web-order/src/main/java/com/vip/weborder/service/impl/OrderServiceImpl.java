package com.vip.weborder.service.impl;

import com.vip.weborder.domain.entity.User;
import com.vip.weborder.mapper.UserMapper;
import com.vip.weborder.service.OrderService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    UserMapper userMapper;
    @Override
    public List<User> test() {
        return userMapper.test();
    }
}
