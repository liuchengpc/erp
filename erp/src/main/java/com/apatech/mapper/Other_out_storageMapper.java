package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Other_out_storage;
import com.apatech.domain.Team;

public interface Other_out_storageMapper {
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
	
    int deleteByPrimaryKey(String oosId);

    int insert(Other_out_storage record);

    int insertSelective(Other_out_storage record);

    Other_out_storage selectByPrimaryKey(String oosId);

    int updateByPrimaryKeySelective(Other_out_storage record);

    int updateByPrimaryKey(Other_out_storage record);
}