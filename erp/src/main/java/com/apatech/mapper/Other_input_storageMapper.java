package com.apatech.mapper;

import com.apatech.domain.Other_input_storage;

public interface Other_input_storageMapper {
    int deleteByPrimaryKey(String oisId);

    int insert(Other_input_storage record);

    int insertSelective(Other_input_storage record);

    Other_input_storage selectByPrimaryKey(String oisId);

    int updateByPrimaryKeySelective(Other_input_storage record);

    int updateByPrimaryKey(Other_input_storage record);
}