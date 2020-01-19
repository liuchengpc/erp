package com.apatech.mapper;

import com.apatech.domain.Dull_section;

public interface Dull_sectionMapper {
    int deleteByPrimaryKey(String dsId);

    int insert(Dull_section record);

    int insertSelective(Dull_section record);

    Dull_section selectByPrimaryKey(String dsId);

    int updateByPrimaryKeySelective(Dull_section record);

    int updateByPrimaryKey(Dull_section record);
}