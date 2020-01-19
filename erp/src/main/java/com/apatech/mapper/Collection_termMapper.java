package com.apatech.mapper;

import com.apatech.domain.Collection_term;

public interface Collection_termMapper {
    int deleteByPrimaryKey(String coteId);

    int insert(Collection_term record);

    int insertSelective(Collection_term record);

    Collection_term selectByPrimaryKey(String coteId);

    int updateByPrimaryKeySelective(Collection_term record);

    int updateByPrimaryKey(Collection_term record);
}