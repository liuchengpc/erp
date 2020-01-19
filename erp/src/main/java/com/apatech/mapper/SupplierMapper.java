package com.apatech.mapper;

import com.apatech.domain.Supplier;

public interface SupplierMapper {
    int deleteByPrimaryKey(String supplierId);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(String supplierId);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}