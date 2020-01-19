package com.apatech.mapper;

import com.apatech.domain.Purchase_inquiry;

public interface Purchase_inquiryMapper {
    int deleteByPrimaryKey(String piId);

    int insert(Purchase_inquiry record);

    int insertSelective(Purchase_inquiry record);

    Purchase_inquiry selectByPrimaryKey(String piId);

    int updateByPrimaryKeySelective(Purchase_inquiry record);

    int updateByPrimaryKey(Purchase_inquiry record);
}