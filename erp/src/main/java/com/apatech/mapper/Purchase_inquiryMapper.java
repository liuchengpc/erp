package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Purchase_inquiry;
import com.apatech.domain.Team;

public interface Purchase_inquiryMapper {
	 List<Purchase_inquiry> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Purchase_inquiry WHERE pi_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String piId);

    int insert(Purchase_inquiry record);

    int insertSelective(Purchase_inquiry record);

    Purchase_inquiry selectByPrimaryKey(String piId);

    int updateByPrimaryKeySelective(Purchase_inquiry record);

    int updateByPrimaryKey(Purchase_inquiry record);
}