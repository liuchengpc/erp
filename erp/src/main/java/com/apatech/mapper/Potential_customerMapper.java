package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Potential_customer;
import com.apatech.domain.Team;

public interface Potential_customerMapper {
	 List<Potential_customer> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Potential_customer WHERE pc_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String pcId);

    int insert(Potential_customer record);

    int insertSelective(Potential_customer record);

    Potential_customer selectByPrimaryKey(String pcId);

    int updateByPrimaryKeySelective(Potential_customer record);

    int updateByPrimaryKey(Potential_customer record);
}