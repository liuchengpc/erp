package com.apatech.mapper;

import com.apatech.domain.Settle_accounts_type;

public interface Settle_accounts_typeMapper {
    int deleteByPrimaryKey(String satId);

    int insert(Settle_accounts_type record);

    int insertSelective(Settle_accounts_type record);

    Settle_accounts_type selectByPrimaryKey(String satId);

    int updateByPrimaryKeySelective(Settle_accounts_type record);

    int updateByPrimaryKey(Settle_accounts_type record);
}