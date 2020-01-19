package com.apatech.mapper;

import com.apatech.domain.Customer_type;

public interface Customer_typeMapper {
    int deleteByPrimaryKey(String cutyId);

    int insert(Customer_type record);

    int insertSelective(Customer_type record);

    Customer_type selectByPrimaryKey(String cutyId);

    int updateByPrimaryKeySelective(Customer_type record);

    int updateByPrimaryKey(Customer_type record);
}