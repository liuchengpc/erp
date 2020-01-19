package com.apatech.mapper;

import com.apatech.domain.Receivablesdetails;

public interface ReceivablesdetailsMapper {
    int deleteByPrimaryKey(String recedetailId);

    int insert(Receivablesdetails record);

    int insertSelective(Receivablesdetails record);

    Receivablesdetails selectByPrimaryKey(String recedetailId);

    int updateByPrimaryKeySelective(Receivablesdetails record);

    int updateByPrimaryKey(Receivablesdetails record);
}