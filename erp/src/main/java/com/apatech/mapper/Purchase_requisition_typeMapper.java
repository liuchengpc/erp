package com.apatech.mapper;

import com.apatech.domain.Purchase_requisition_type;

public interface Purchase_requisition_typeMapper {
    int deleteByPrimaryKey(String prtId);

    int insert(Purchase_requisition_type record);

    int insertSelective(Purchase_requisition_type record);

    Purchase_requisition_type selectByPrimaryKey(String prtId);

    int updateByPrimaryKeySelective(Purchase_requisition_type record);

    int updateByPrimaryKey(Purchase_requisition_type record);
}