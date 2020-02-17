package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Purchasing_order_detailed;

public interface Purchasing_order_detailedMapper {
 List<Purchasing_order_detailed> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Purchasing_order_type WHERE pot_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String podId);

    int insert(Purchasing_order_detailed record);

    int insertSelective(Purchasing_order_detailed record);

    Purchasing_order_detailed selectByPrimaryKey(String podId);

    int updateByPrimaryKeySelective(Purchasing_order_detailed record);

    int updateByPrimaryKey(Purchasing_order_detailed record);
}