package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Sales_order_type;
import com.apatech.domain.Team;

public interface Sales_order_typeMapper {
	List<Sales_order_type> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Sales_order_type WHERE sot_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String sotId);

    int insert(Sales_order_type record);

    int insertSelective(Sales_order_type record);

    Sales_order_type selectByPrimaryKey(String sotId);

    int updateByPrimaryKeySelective(Sales_order_type record);

    int updateByPrimaryKey(Sales_order_type record);
}