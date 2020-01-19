package com.apatech.mapper;

import com.apatech.domain.Salesorderlist;

public interface SalesorderlistMapper {
    int deleteByPrimaryKey(String solId);

    int insert(Salesorderlist record);

    int insertSelective(Salesorderlist record);

    Salesorderlist selectByPrimaryKey(String solId);

    int updateByPrimaryKeySelective(Salesorderlist record);

    int updateByPrimaryKey(Salesorderlist record);
}