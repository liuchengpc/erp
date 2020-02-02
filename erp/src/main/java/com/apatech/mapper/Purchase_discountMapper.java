package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Purchase_discount;
import com.apatech.domain.Team;

public interface Purchase_discountMapper {
	 List<Purchase_discount> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Purchase_discount WHERE pd_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String pdId);

    int insert(Purchase_discount record);

    int insertSelective(Purchase_discount record);

    Purchase_discount selectByPrimaryKey(String pdId);

    int updateByPrimaryKeySelective(Purchase_discount record);

    int updateByPrimaryKey(Purchase_discount record);
}