package com.vip.webordertwo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vip.webordertwo.domain.entity.Merchat;

public interface MerchatMapper extends BaseMapper<Merchat> {
    int deleteByPrimaryKey(Integer merchatId);

    int insert(Merchat record);

    int insertSelective(Merchat record);

    Merchat selectByPrimaryKey(Integer merchatId);

    int updateByPrimaryKeySelective(Merchat record);

    int updateByPrimaryKey(Merchat record);
}