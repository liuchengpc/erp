package com.apatech.mapper;

import com.apatech.domain.subject_blanket_category;

public interface subject_blanket_categoryMapper {
    int deleteByPrimaryKey(String sbcId);

    int insert(subject_blanket_category record);

    int insertSelective(subject_blanket_category record);

    subject_blanket_category selectByPrimaryKey(String sbcId);

    int updateByPrimaryKeySelective(subject_blanket_category record);

    int updateByPrimaryKey(subject_blanket_category record);
}