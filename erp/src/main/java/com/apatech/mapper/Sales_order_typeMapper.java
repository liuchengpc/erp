package com.apatech.mapper;

import com.apatech.domain.Sales_order_type;

public interface Sales_order_typeMapper {
    int deleteByPrimaryKey(String sotId);

    int insert(Sales_order_type record);

    int insertSelective(Sales_order_type record);

    Sales_order_type selectByPrimaryKey(String sotId);

    int updateByPrimaryKeySelective(Sales_order_type record);

    int updateByPrimaryKey(Sales_order_type record);
}