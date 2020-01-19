package com.apatech.mapper;

import com.apatech.domain.Material_type;

public interface Material_typeMapper {
    int deleteByPrimaryKey(String mtId);

    int insert(Material_type record);

    int insertSelective(Material_type record);

    Material_type selectByPrimaryKey(String mtId);

    int updateByPrimaryKeySelective(Material_type record);

    int updateByPrimaryKey(Material_type record);
}