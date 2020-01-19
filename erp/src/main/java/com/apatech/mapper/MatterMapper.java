package com.apatech.mapper;

import com.apatech.domain.Matter;

public interface MatterMapper {
    int deleteByPrimaryKey(String matterId);

    int insert(Matter record);

    int insertSelective(Matter record);

    Matter selectByPrimaryKey(String matterId);

    int updateByPrimaryKeySelective(Matter record);

    int updateByPrimaryKey(Matter record);
}