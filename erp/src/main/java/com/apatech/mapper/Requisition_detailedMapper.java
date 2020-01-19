package com.apatech.mapper;

import com.apatech.domain.Requisition_detailed;

public interface Requisition_detailedMapper {
    int deleteByPrimaryKey(String rdId);

    int insert(Requisition_detailed record);

    int insertSelective(Requisition_detailed record);

    Requisition_detailed selectByPrimaryKey(String rdId);

    int updateByPrimaryKeySelective(Requisition_detailed record);

    int updateByPrimaryKeyWithBLOBs(Requisition_detailed record);

    int updateByPrimaryKey(Requisition_detailed record);
}