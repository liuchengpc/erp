package com.apatech.mapper;

import com.apatech.domain.Purchase_discount_detailed;

public interface Purchase_discount_detailedMapper {
    int deleteByPrimaryKey(String pddId);

    int insert(Purchase_discount_detailed record);

    int insertSelective(Purchase_discount_detailed record);

    Purchase_discount_detailed selectByPrimaryKey(String pddId);

    int updateByPrimaryKeySelective(Purchase_discount_detailed record);

    int updateByPrimaryKey(Purchase_discount_detailed record);
}