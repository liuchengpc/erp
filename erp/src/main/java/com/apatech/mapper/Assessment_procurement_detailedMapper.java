package com.apatech.mapper;

import com.apatech.domain.Assessment_procurement_detailed;

public interface Assessment_procurement_detailedMapper {
    int deleteByPrimaryKey(String apdId);

    int insert(Assessment_procurement_detailed record);

    int insertSelective(Assessment_procurement_detailed record);

    Assessment_procurement_detailed selectByPrimaryKey(String apdId);

    int updateByPrimaryKeySelective(Assessment_procurement_detailed record);

    int updateByPrimaryKey(Assessment_procurement_detailed record);
}