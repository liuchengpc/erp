package com.apatech.mapper;

import com.apatech.domain.Warehouse_detail;

public interface Warehouse_detailMapper {
    int deleteByPrimaryKey(String wdId);

    int insert(Warehouse_detail record);

    int insertSelective(Warehouse_detail record);

    Warehouse_detail selectByPrimaryKey(String wdId);

    int updateByPrimaryKeySelective(Warehouse_detail record);

    int updateByPrimaryKey(Warehouse_detail record);
}