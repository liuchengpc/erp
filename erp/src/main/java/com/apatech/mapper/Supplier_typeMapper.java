package com.apatech.mapper;

import com.apatech.domain.Supplier_type;

public interface Supplier_typeMapper {
    int deleteByPrimaryKey(String stId);

    int insert(Supplier_type record);

    int insertSelective(Supplier_type record);

    Supplier_type selectByPrimaryKey(String stId);

    int updateByPrimaryKeySelective(Supplier_type record);

    int updateByPrimaryKey(Supplier_type record);
}