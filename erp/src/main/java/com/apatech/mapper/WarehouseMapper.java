package com.apatech.mapper;

import com.apatech.domain.Warehouse;

public interface WarehouseMapper {
    int deleteByPrimaryKey(String warehouseId);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    Warehouse selectByPrimaryKey(String warehouseId);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}