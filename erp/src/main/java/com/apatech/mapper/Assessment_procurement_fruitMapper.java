package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Assessment_procurement_fruit;
import com.apatech.domain.Team;

public interface Assessment_procurement_fruitMapper {
	 List<Assessment_procurement_fruit> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Assessment_procurement_fruit WHERE prt_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String apfId);

    int insert(Assessment_procurement_fruit record);

    int insertSelective(Assessment_procurement_fruit record);

    Assessment_procurement_fruit selectByPrimaryKey(String apfId);

    int updateByPrimaryKeySelective(Assessment_procurement_fruit record);

    int updateByPrimaryKey(Assessment_procurement_fruit record);
}