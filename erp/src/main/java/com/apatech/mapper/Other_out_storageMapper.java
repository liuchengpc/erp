package com.apatech.mapper;

import com.apatech.domain.Other_out_storage;

public interface Other_out_storageMapper {
    int deleteByPrimaryKey(String oosId);

    int insert(Other_out_storage record);

    int insertSelective(Other_out_storage record);

    Other_out_storage selectByPrimaryKey(String oosId);

    int updateByPrimaryKeySelective(Other_out_storage record);

    int updateByPrimaryKey(Other_out_storage record);
}