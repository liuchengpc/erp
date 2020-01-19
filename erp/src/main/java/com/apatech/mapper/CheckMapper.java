package com.apatech.mapper;

import com.apatech.domain.Check;

public interface CheckMapper {
    int deleteByPrimaryKey(String checkId);

    int insert(Check record);

    int insertSelective(Check record);

    Check selectByPrimaryKey(String checkId);

    int updateByPrimaryKeySelective(Check record);

    int updateByPrimaryKey(Check record);
}