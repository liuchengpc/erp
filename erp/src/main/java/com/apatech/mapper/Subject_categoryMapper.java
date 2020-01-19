package com.apatech.mapper;

import com.apatech.domain.Subject_category;

public interface Subject_categoryMapper {
    int deleteByPrimaryKey(String scId);

    int insert(Subject_category record);

    int insertSelective(Subject_category record);

    Subject_category selectByPrimaryKey(String scId);

    int updateByPrimaryKeySelective(Subject_category record);

    int updateByPrimaryKey(Subject_category record);
}