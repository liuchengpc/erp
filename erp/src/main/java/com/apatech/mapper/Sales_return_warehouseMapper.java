package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Sales_return_warehouse;
import com.apatech.domain.Team;

public interface Sales_return_warehouseMapper {
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
	
    int deleteByPrimaryKey(String srwId);

    int insert(Sales_return_warehouse record);

    int insertSelective(Sales_return_warehouse record);

    Sales_return_warehouse selectByPrimaryKey(String srwId);

    int updateByPrimaryKeySelective(Sales_return_warehouse record);

    int updateByPrimaryKey(Sales_return_warehouse record);
}