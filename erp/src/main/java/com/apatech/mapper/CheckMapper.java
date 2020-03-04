package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Check;
import com.apatech.domain.Team;

public interface CheckMapper {

	 List<Check> selectAll();
	 
	 List<Check> queryAllByTime();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"`Check` WHERE Check_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	 
    int deleteByPrimaryKey(String checkId);

    int insert(Check record);

    int insertSelective(Check record);
    int insertSelective2(Check record);
    Check selectByPrimaryKey(String checkId);

    int updateByPrimaryKeySelective(Check record);
    
    int updateByPrimaryKeySelective2(Check record);

    int updateByPrimaryKey(Check record);
}