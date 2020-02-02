package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Adjust_price;

public interface Adjust_priceMapper {
	 List<Adjust_price> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Adjust_price WHERE ap_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String apId);

    int insert(Adjust_price record);

    int insertSelective(Adjust_price record);

    Adjust_price selectByPrimaryKey(String apId);

    int updateByPrimaryKeySelective(Adjust_price record);

    int updateByPrimaryKey(Adjust_price record);
}