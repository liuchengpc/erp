package com.apatech.mapper;

import com.apatech.domain.Assessment_procurement_fruit;

public interface Assessment_procurement_fruitMapper {
    int deleteByPrimaryKey(String apfId);

    int insert(Assessment_procurement_fruit record);

    int insertSelective(Assessment_procurement_fruit record);

    Assessment_procurement_fruit selectByPrimaryKey(String apfId);

    int updateByPrimaryKeySelective(Assessment_procurement_fruit record);

    int updateByPrimaryKey(Assessment_procurement_fruit record);
}