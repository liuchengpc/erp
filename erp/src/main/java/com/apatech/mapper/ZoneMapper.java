package com.apatech.mapper;

import com.apatech.domain.Zone;

public interface ZoneMapper {
    int deleteByPrimaryKey(String zoneId);

    int insert(Zone record);

    int insertSelective(Zone record);

    Zone selectByPrimaryKey(String zoneId);

    int updateByPrimaryKeySelective(Zone record);

    int updateByPrimaryKey(Zone record);
}