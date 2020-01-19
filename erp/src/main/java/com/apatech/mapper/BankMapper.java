package com.apatech.mapper;

import com.apatech.domain.Bank;

public interface BankMapper {
    int deleteByPrimaryKey(String bankId);

    int insert(Bank record);

    int insertSelective(Bank record);

    Bank selectByPrimaryKey(String bankId);

    int updateByPrimaryKeySelective(Bank record);

    int updateByPrimaryKey(Bank record);
}