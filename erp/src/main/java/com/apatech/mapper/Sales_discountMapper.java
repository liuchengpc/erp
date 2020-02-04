package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Sales_discount;
import com.apatech.domain.Team;

public interface Sales_discountMapper {
	List<Sales_discount> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Sales_discount WHERE sd_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String sdId);

    int insert(Sales_discount record);

    int insertSelective(Sales_discount record);

    Sales_discount selectByPrimaryKey(String sdId);

    int updateByPrimaryKeySelective(Sales_discount record);

    int updateByPrimaryKey(Sales_discount record);
}