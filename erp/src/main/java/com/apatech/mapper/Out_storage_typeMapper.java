package com.apatech.mapper;

import com.apatech.domain.Out_storage_type;

public interface Out_storage_typeMapper {
    int deleteByPrimaryKey(String ostId);

    int insert(Out_storage_type record);

    int insertSelective(Out_storage_type record);

    Out_storage_type selectByPrimaryKey(String ostId);

    int updateByPrimaryKeySelective(Out_storage_type record);

    int updateByPrimaryKey(Out_storage_type record);
}