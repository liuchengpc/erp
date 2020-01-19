package com.apatech.mapper;

import com.apatech.domain.Purchase_requisition_detailed;

public interface Purchase_requisition_detailedMapper {
    int deleteByPrimaryKey(String prdId);

    int insert(Purchase_requisition_detailed record);

    int insertSelective(Purchase_requisition_detailed record);

    Purchase_requisition_detailed selectByPrimaryKey(String prdId);

    int updateByPrimaryKeySelective(Purchase_requisition_detailed record);

    int updateByPrimaryKey(Purchase_requisition_detailed record);
}