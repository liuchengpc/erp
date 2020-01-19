package com.apatech.mapper;

import com.apatech.domain.Salesorder;

public interface SalesorderMapper {
    int deleteByPrimaryKey(String soId);

    int insert(Salesorder record);

    int insertSelective(Salesorder record);

    Salesorder selectByPrimaryKey(String soId);

    int updateByPrimaryKeySelective(Salesorder record);

    int updateByPrimaryKey(Salesorder record);
}