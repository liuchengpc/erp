package com.apatech.mapper;

import com.apatech.domain.Casha_ccount;

public interface Casha_ccountMapper {
    int deleteByPrimaryKey(String ccId);

    int insert(Casha_ccount record);

    int insertSelective(Casha_ccount record);

    Casha_ccount selectByPrimaryKey(String ccId);

    int updateByPrimaryKeySelective(Casha_ccount record);

    int updateByPrimaryKey(Casha_ccount record);
}