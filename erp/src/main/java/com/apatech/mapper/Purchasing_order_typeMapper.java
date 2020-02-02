package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Purchasing_order_type;
import com.apatech.domain.Team;

public interface Purchasing_order_typeMapper {
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
	
    int deleteByPrimaryKey(String potId);

    int insert(Purchasing_order_type record);

    int insertSelective(Purchasing_order_type record);

    Purchasing_order_type selectByPrimaryKey(String potId);

    int updateByPrimaryKeySelective(Purchasing_order_type record);

    int updateByPrimaryKey(Purchasing_order_type record);
}