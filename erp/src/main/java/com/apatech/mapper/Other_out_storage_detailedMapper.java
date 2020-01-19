package com.apatech.mapper;

import com.apatech.domain.Other_out_storage_detailed;

public interface Other_out_storage_detailedMapper {
    int deleteByPrimaryKey(String oosdId);

    int insert(Other_out_storage_detailed record);

    int insertSelective(Other_out_storage_detailed record);

    Other_out_storage_detailed selectByPrimaryKey(String oosdId);

    int updateByPrimaryKeySelective(Other_out_storage_detailed record);

    int updateByPrimaryKey(Other_out_storage_detailed record);
}