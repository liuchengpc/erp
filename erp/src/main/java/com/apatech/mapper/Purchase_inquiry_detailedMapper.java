package com.apatech.mapper;

import com.apatech.domain.Purchase_inquiry_detailed;

public interface Purchase_inquiry_detailedMapper {
    int deleteByPrimaryKey(String didId);

    int insert(Purchase_inquiry_detailed record);

    int insertSelective(Purchase_inquiry_detailed record);

    Purchase_inquiry_detailed selectByPrimaryKey(String didId);

    int updateByPrimaryKeySelective(Purchase_inquiry_detailed record);

    int updateByPrimaryKey(Purchase_inquiry_detailed record);
}