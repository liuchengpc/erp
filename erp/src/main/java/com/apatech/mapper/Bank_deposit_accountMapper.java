package com.apatech.mapper;

import com.apatech.domain.Bank_deposit_account;

public interface Bank_deposit_accountMapper {
    int deleteByPrimaryKey(String adaId);

    int insert(Bank_deposit_account record);

    int insertSelective(Bank_deposit_account record);

    Bank_deposit_account selectByPrimaryKey(String adaId);

    int updateByPrimaryKeySelective(Bank_deposit_account record);

    int updateByPrimaryKey(Bank_deposit_account record);
}