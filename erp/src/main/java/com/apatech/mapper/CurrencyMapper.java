package com.apatech.mapper;

import com.apatech.domain.Currency;

public interface CurrencyMapper {
    int deleteByPrimaryKey(String currencyId);

    int insert(Currency record);

    int insertSelective(Currency record);

    Currency selectByPrimaryKey(String currencyId);

    int updateByPrimaryKeySelective(Currency record);

    int updateByPrimaryKey(Currency record);
}