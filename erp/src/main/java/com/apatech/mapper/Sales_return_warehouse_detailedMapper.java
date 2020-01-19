package com.apatech.mapper;

import com.apatech.domain.Sales_return_warehouse_detailed;

public interface Sales_return_warehouse_detailedMapper {
    int deleteByPrimaryKey(String srwdId);

    int insert(Sales_return_warehouse_detailed record);

    int insertSelective(Sales_return_warehouse_detailed record);

    Sales_return_warehouse_detailed selectByPrimaryKey(String srwdId);

    int updateByPrimaryKeySelective(Sales_return_warehouse_detailed record);

    int updateByPrimaryKey(Sales_return_warehouse_detailed record);
}