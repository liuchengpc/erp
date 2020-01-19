package com.apatech.mapper;

import com.apatech.domain.Other_input_storage_detailed;

public interface Other_input_storage_detailedMapper {
    int deleteByPrimaryKey(String oisdId);

    int insert(Other_input_storage_detailed record);

    int insertSelective(Other_input_storage_detailed record);

    Other_input_storage_detailed selectByPrimaryKey(String oisdId);

    int updateByPrimaryKeySelective(Other_input_storage_detailed record);

    int updateByPrimaryKey(Other_input_storage_detailed record);
}