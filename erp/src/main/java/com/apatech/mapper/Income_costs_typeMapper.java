package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Income_costs_type;
import com.apatech.domain.Team;

public interface Income_costs_typeMapper {
	 List<Income_costs_type> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Income_costs_type WHERE ict_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String ictId);

    int insert(Income_costs_type record);

    int insertSelective(Income_costs_type record);

    Income_costs_type selectByPrimaryKey(String ictId);

    int updateByPrimaryKeySelective(Income_costs_type record);

    int updateByPrimaryKey(Income_costs_type record);
}