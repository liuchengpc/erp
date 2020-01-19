package com.apatech.mapper;

import com.apatech.domain.Purchase_returns;

public interface Purchase_returnsMapper {
    int deleteByPrimaryKey(String pureId);

    int insert(Purchase_returns record);

    int insertSelective(Purchase_returns record);

    Purchase_returns selectByPrimaryKey(String pureId);

    int updateByPrimaryKeySelective(Purchase_returns record);

    int updateByPrimaryKey(Purchase_returns record);
}