package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Sales_out_warehouse_detailed;
import com.apatech.domain.Team;

public interface Sales_out_warehouse_detailedMapper {
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
	
    int deleteByPrimaryKey(String sowdId);

    int insert(Sales_out_warehouse_detailed record);

    int insertSelective(Sales_out_warehouse_detailed record);

    Sales_out_warehouse_detailed selectByPrimaryKey(String sowdId);

    int updateByPrimaryKeySelective(Sales_out_warehouse_detailed record);

    int updateByPrimaryKey(Sales_out_warehouse_detailed record);
}