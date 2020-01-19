package com.apatech.mapper;

import com.apatech.domain.Purchase_requisition;

public interface Purchase_requisitionMapper {
    int deleteByPrimaryKey(String prId);

    int insert(Purchase_requisition record);

    int insertSelective(Purchase_requisition record);

    Purchase_requisition selectByPrimaryKey(String prId);

    int updateByPrimaryKeySelective(Purchase_requisition record);

    int updateByPrimaryKey(Purchase_requisition record);
}