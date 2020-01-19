package com.apatech.mapper;

import com.apatech.domain.Requisition;

public interface RequisitionMapper {
    int deleteByPrimaryKey(String requisitionId);

    int insert(Requisition record);

    int insertSelective(Requisition record);

    Requisition selectByPrimaryKey(String requisitionId);

    int updateByPrimaryKeySelective(Requisition record);

    int updateByPrimaryKey(Requisition record);
}