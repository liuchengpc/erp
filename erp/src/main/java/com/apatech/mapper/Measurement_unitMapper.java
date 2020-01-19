package com.apatech.mapper;

import com.apatech.domain.Measurement_unit;

public interface Measurement_unitMapper {
    int deleteByPrimaryKey(String muId);

    int insert(Measurement_unit record);

    int insertSelective(Measurement_unit record);

    Measurement_unit selectByPrimaryKey(String muId);

    int updateByPrimaryKeySelective(Measurement_unit record);

    int updateByPrimaryKey(Measurement_unit record);
}