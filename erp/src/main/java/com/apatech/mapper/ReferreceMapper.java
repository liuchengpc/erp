package com.apatech.mapper;

import com.apatech.domain.Referrece;

public interface ReferreceMapper {
    int deleteByPrimaryKey(String referreceId);

    int insert(Referrece record);

    int insertSelective(Referrece record);

    Referrece selectByPrimaryKey(String referreceId);

    int updateByPrimaryKeySelective(Referrece record);

    int updateByPrimaryKey(Referrece record);
}