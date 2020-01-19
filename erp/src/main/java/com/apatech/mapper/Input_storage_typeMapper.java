package com.apatech.mapper;

import com.apatech.domain.Input_storage_type;

public interface Input_storage_typeMapper {
    int deleteByPrimaryKey(String istId);

    int insert(Input_storage_type record);

    int insertSelective(Input_storage_type record);

    Input_storage_type selectByPrimaryKey(String istId);

    int updateByPrimaryKeySelective(Input_storage_type record);

    int updateByPrimaryKey(Input_storage_type record);
}