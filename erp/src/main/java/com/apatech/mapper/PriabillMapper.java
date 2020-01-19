package com.apatech.mapper;

import com.apatech.domain.Priabill;

public interface PriabillMapper {
    int deleteByPrimaryKey(String priabillId);

    int insert(Priabill record);

    int insertSelective(Priabill record);

    Priabill selectByPrimaryKey(String priabillId);

    int updateByPrimaryKeySelective(Priabill record);

    int updateByPrimaryKey(Priabill record);
}