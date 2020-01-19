package com.apatech.mapper;

import com.apatech.domain.Purchase_discount;

public interface Purchase_discountMapper {
    int deleteByPrimaryKey(String pdId);

    int insert(Purchase_discount record);

    int insertSelective(Purchase_discount record);

    Purchase_discount selectByPrimaryKey(String pdId);

    int updateByPrimaryKeySelective(Purchase_discount record);

    int updateByPrimaryKey(Purchase_discount record);
}