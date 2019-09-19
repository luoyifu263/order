package com.vip.weborder.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vip.weborder.domain.entity.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> test();
}