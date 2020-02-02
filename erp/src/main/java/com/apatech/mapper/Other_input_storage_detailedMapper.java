package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Other_input_storage_detailed;
import com.apatech.domain.Team;

public interface Other_input_storage_detailedMapper {
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
	
    int deleteByPrimaryKey(String oisdId);

    int insert(Other_input_storage_detailed record);

    int insertSelective(Other_input_storage_detailed record);

    Other_input_storage_detailed selectByPrimaryKey(String oisdId);

    int updateByPrimaryKeySelective(Other_input_storage_detailed record);

    int updateByPrimaryKey(Other_input_storage_detailed record);
}