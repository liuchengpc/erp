package com.apatech.mapper;

import com.apatech.domain.Payablesmain;

public interface PayablesmainMapper {
    int deleteByPrimaryKey(String payablesmainId);

    int insert(Payablesmain record);

    int insertSelective(Payablesmain record);

    Payablesmain selectByPrimaryKey(String payablesmainId);

    int updateByPrimaryKeySelective(Payablesmain record);

    int updateByPrimaryKey(Payablesmain record);
}