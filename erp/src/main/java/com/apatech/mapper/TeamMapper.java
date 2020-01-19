package com.apatech.mapper;

import com.apatech.domain.Team;

public interface TeamMapper {
    int deleteByPrimaryKey(String teamId);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(String teamId);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}