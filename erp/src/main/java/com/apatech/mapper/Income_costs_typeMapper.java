package com.apatech.mapper;

import com.apatech.domain.Income_costs_type;

public interface Income_costs_typeMapper {
    int deleteByPrimaryKey(String ictId);

    int insert(Income_costs_type record);

    int insertSelective(Income_costs_type record);

    Income_costs_type selectByPrimaryKey(String ictId);

    int updateByPrimaryKeySelective(Income_costs_type record);

    int updateByPrimaryKey(Income_costs_type record);
}