package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Privilege;

public interface PrivilegeMapper {
    int deleteByPrimaryKey(Integer privilegeid);

    int insert(Privilege record);

    int insertSelective(Privilege record);

    Privilege selectByPrimaryKey(Integer privilegeid);
    
    @Select("select * from Privilege")
    List<Privilege> selectAll();

    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKey(Privilege record);
}