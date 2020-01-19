package com.apatech.mapper;

import com.apatech.domain.Purchase_returns_detailed;

public interface Purchase_returns_detailedMapper {
    int deleteByPrimaryKey(String puredId);

    int insert(Purchase_returns_detailed record);

    int insertSelective(Purchase_returns_detailed record);

    Purchase_returns_detailed selectByPrimaryKey(String puredId);

    int updateByPrimaryKeySelective(Purchase_returns_detailed record);

    int updateByPrimaryKey(Purchase_returns_detailed record);
}