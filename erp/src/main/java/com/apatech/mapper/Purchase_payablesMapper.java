package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Purchase_payables;

public interface Purchase_payablesMapper {
 List<Purchase_payables> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Purchase_payables WHERE pp_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(Integer ppId);

    int insert(Purchase_payables record);

    int insertSelective(Purchase_payables record);

    Purchase_payables selectByPrimaryKey(Integer ppId);

    int updateByPrimaryKeySelective(Purchase_payables record);

    int updateByPrimaryKey(Purchase_payables record);
}