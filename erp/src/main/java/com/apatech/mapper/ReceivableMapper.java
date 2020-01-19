package com.apatech.mapper;

import com.apatech.domain.Receivable;

public interface ReceivableMapper {
    int deleteByPrimaryKey(String receivableId);

    int insert(Receivable record);

    int insertSelective(Receivable record);

    Receivable selectByPrimaryKey(String receivableId);

    int updateByPrimaryKeySelective(Receivable record);

    int updateByPrimaryKey(Receivable record);
}