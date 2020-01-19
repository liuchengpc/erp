package com.apatech.mapper;

import com.apatech.domain.Customer_address;

public interface Customer_addressMapper {
    int deleteByPrimaryKey(String caAddressid);

    int insert(Customer_address record);

    int insertSelective(Customer_address record);

    Customer_address selectByPrimaryKey(String caAddressid);

    int updateByPrimaryKeySelective(Customer_address record);

    int updateByPrimaryKey(Customer_address record);
}