package com.apatech.mapper;

import com.apatech.domain.Sales_discount;

public interface Sales_discountMapper {
    int deleteByPrimaryKey(String sdId);

    int insert(Sales_discount record);

    int insertSelective(Sales_discount record);

    Sales_discount selectByPrimaryKey(String sdId);

    int updateByPrimaryKeySelective(Sales_discount record);

    int updateByPrimaryKey(Sales_discount record);
}