package com.apatech.mapper;

import com.apatech.domain.Invoice_type;

public interface Invoice_typeMapper {
    int deleteByPrimaryKey(String itId);

    int insert(Invoice_type record);

    int insertSelective(Invoice_type record);

    Invoice_type selectByPrimaryKey(String itId);

    int updateByPrimaryKeySelective(Invoice_type record);

    int updateByPrimaryKey(Invoice_type record);
}