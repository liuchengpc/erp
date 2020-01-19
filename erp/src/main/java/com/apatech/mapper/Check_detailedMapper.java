package com.apatech.mapper;

import com.apatech.domain.Check_detailed;

public interface Check_detailedMapper {
    int deleteByPrimaryKey(String cdId);

    int insert(Check_detailed record);

    int insertSelective(Check_detailed record);

    Check_detailed selectByPrimaryKey(String cdId);

    int updateByPrimaryKeySelective(Check_detailed record);

    int updateByPrimaryKey(Check_detailed record);
}