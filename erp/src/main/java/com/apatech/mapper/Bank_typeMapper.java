package com.apatech.mapper;

import com.apatech.domain.Bank_type;

public interface Bank_typeMapper {
    int deleteByPrimaryKey(String btId);

    int insert(Bank_type record);

    int insertSelective(Bank_type record);

    Bank_type selectByPrimaryKey(String btId);

    int updateByPrimaryKeySelective(Bank_type record);

    int updateByPrimaryKey(Bank_type record);
}