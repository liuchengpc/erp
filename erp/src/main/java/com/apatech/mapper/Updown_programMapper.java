package com.apatech.mapper;

import com.apatech.domain.Updown_program;

public interface Updown_programMapper {
    int deleteByPrimaryKey(String upId);

    int insert(Updown_program record);

    int insertSelective(Updown_program record);

    Updown_program selectByPrimaryKey(String upId);

    int updateByPrimaryKeySelective(Updown_program record);

    int updateByPrimaryKey(Updown_program record);
}