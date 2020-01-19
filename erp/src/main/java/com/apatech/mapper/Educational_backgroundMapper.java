package com.apatech.mapper;

import com.apatech.domain.Educational_background;

public interface Educational_backgroundMapper {
    int deleteByPrimaryKey(String ebId);

    int insert(Educational_background record);

    int insertSelective(Educational_background record);

    Educational_background selectByPrimaryKey(String ebId);

    int updateByPrimaryKeySelective(Educational_background record);

    int updateByPrimaryKey(Educational_background record);
}