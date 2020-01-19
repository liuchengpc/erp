package com.apatech.mapper;

import com.apatech.domain.Payables;

public interface PayablesMapper {
    int deleteByPrimaryKey(String payablesId);

    int insert(Payables record);

    int insertSelective(Payables record);

    Payables selectByPrimaryKey(String payablesId);

    int updateByPrimaryKeySelective(Payables record);

    int updateByPrimaryKey(Payables record);
}