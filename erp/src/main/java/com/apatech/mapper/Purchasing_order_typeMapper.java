package com.apatech.mapper;

import com.apatech.domain.Purchasing_order_type;

public interface Purchasing_order_typeMapper {
    int deleteByPrimaryKey(String potId);

    int insert(Purchasing_order_type record);

    int insertSelective(Purchasing_order_type record);

    Purchasing_order_type selectByPrimaryKey(String potId);

    int updateByPrimaryKeySelective(Purchasing_order_type record);

    int updateByPrimaryKey(Purchasing_order_type record);
}