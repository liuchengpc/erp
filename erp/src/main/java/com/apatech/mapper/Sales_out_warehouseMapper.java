package com.apatech.mapper;

import com.apatech.domain.Sales_out_warehouse;

public interface Sales_out_warehouseMapper {
    int deleteByPrimaryKey(String sowId);

    int insert(Sales_out_warehouse record);

    int insertSelective(Sales_out_warehouse record);

    Sales_out_warehouse selectByPrimaryKey(String sowId);

    int updateByPrimaryKeySelective(Sales_out_warehouse record);

    int updateByPrimaryKey(Sales_out_warehouse record);
}