package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Input_storage_type;
import com.apatech.domain.Team;

public interface Input_storage_typeMapper {
	 List<Team> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"team WHERE team_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String istId);

    int insert(Input_storage_type record);

    int insertSelective(Input_storage_type record);

    Input_storage_type selectByPrimaryKey(String istId);

    int updateByPrimaryKeySelective(Input_storage_type record);

    int updateByPrimaryKey(Input_storage_type record);
}