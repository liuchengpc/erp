package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Customer_demand_products;
import com.apatech.domain.Team;

public interface Customer_demand_productsMapper {
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
	
    int deleteByPrimaryKey(String cdpId);

    int insert(Customer_demand_products record);

    int insertSelective(Customer_demand_products record);

    Customer_demand_products selectByPrimaryKey(String cdpId);

    int updateByPrimaryKeySelective(Customer_demand_products record);

    int updateByPrimaryKey(Customer_demand_products record);
}