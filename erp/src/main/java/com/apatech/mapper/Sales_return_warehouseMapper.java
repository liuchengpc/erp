package com.apatech.mapper;

import com.apatech.domain.Sales_return_warehouse;

public interface Sales_return_warehouseMapper {
    int deleteByPrimaryKey(String srwId);

    int insert(Sales_return_warehouse record);

    int insertSelective(Sales_return_warehouse record);

    Sales_return_warehouse selectByPrimaryKey(String srwId);

    int updateByPrimaryKeySelective(Sales_return_warehouse record);

    int updateByPrimaryKey(Sales_return_warehouse record);
}