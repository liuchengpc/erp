package com.apatech.mapper;

import com.apatech.domain.Sales_out_warehouse_detailed;

public interface Sales_out_warehouse_detailedMapper {
    int deleteByPrimaryKey(String sowdId);

    int insert(Sales_out_warehouse_detailed record);

    int insertSelective(Sales_out_warehouse_detailed record);

    Sales_out_warehouse_detailed selectByPrimaryKey(String sowdId);

    int updateByPrimaryKeySelective(Sales_out_warehouse_detailed record);

    int updateByPrimaryKey(Sales_out_warehouse_detailed record);
}