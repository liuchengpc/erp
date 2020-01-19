package com.apatech.mapper;

import com.apatech.domain.Potential_customer;

public interface Potential_customerMapper {
    int deleteByPrimaryKey(String pcId);

    int insert(Potential_customer record);

    int insertSelective(Potential_customer record);

    Potential_customer selectByPrimaryKey(String pcId);

    int updateByPrimaryKeySelective(Potential_customer record);

    int updateByPrimaryKey(Potential_customer record);
}