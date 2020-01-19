package com.apatech.mapper;

import com.apatech.domain.Sales_out_warehouse_type;

public interface Sales_out_warehouse_typeMapper {
    int deleteByPrimaryKey(String sowtId);

    int insert(Sales_out_warehouse_type record);

    int insertSelective(Sales_out_warehouse_type record);

    Sales_out_warehouse_type selectByPrimaryKey(String sowtId);

    int updateByPrimaryKeySelective(Sales_out_warehouse_type record);

    int updateByPrimaryKey(Sales_out_warehouse_type record);
}