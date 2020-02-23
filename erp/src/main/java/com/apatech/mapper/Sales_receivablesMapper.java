package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Sales_receivables;

public interface Sales_receivablesMapper {
	List<Sales_receivables> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Sales_receivables WHERE sr_custom1=#{billdate}")
   String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(Integer srId);

    int insert(Sales_receivables record);

    int insertSelective(Sales_receivables record);

    Sales_receivables selectByPrimaryKey(Integer srId);

    int updateByPrimaryKeySelective(Sales_receivables record);

    int updateByPrimaryKey(Sales_receivables record);
}