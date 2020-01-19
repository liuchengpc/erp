package com.apatech.mapper;

import com.apatech.domain.Assessment_procurement;

public interface Assessment_procurementMapper {
    int deleteByPrimaryKey(String apId);

    int insert(Assessment_procurement record);

    int insertSelective(Assessment_procurement record);

    Assessment_procurement selectByPrimaryKey(String apId);

    int updateByPrimaryKeySelective(Assessment_procurement record);

    int updateByPrimaryKey(Assessment_procurement record);
}