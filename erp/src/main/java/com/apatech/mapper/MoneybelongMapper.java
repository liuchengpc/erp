package com.apatech.mapper;

import com.apatech.domain.Moneybelong;

public interface MoneybelongMapper {
    int deleteByPrimaryKey(String moneybelongId);

    int insert(Moneybelong record);

    int insertSelective(Moneybelong record);

    Moneybelong selectByPrimaryKey(String moneybelongId);

    int updateByPrimaryKeySelective(Moneybelong record);

    int updateByPrimaryKey(Moneybelong record);
}