package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Purchasing_order;

public interface Purchasing_orderMapper {
 List<Purchasing_order> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Purchasing_order_type WHERE pot_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String poId);

    int insert(Purchasing_order record);

    int insertSelective(Purchasing_order record);

    Purchasing_order selectByPrimaryKey(String poId);

    int updateByPrimaryKeySelective(Purchasing_order record);

    int updateByPrimaryKey(Purchasing_order record);
}