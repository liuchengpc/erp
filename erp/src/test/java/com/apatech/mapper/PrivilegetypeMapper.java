package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Privilegetype;

public interface PrivilegetypeMapper {
	List<Privilegetype> queryPrivilegeType();
	
    int deleteByPrimaryKey(Integer privilegetypeid);

    int insert(Privilegetype record);

    int insertSelective(Privilegetype record);

    Privilegetype selectByPrimaryKey(Integer privilegetypeid);
    
    @Select("select * from Privilegetype")
    List<Privilegetype> selectAll();

    int updateByPrimaryKeySelective(Privilegetype record);

    int updateByPrimaryKey(Privilegetype record);
}