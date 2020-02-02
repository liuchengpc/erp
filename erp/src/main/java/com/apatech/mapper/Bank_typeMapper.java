package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Bank_type;
import com.apatech.domain.Team;

public interface Bank_typeMapper {
	 List<Bank_type> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Bank_type WHERE bt_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String btId);

    int insert(Bank_type record);

    int insertSelective(Bank_type record);

    Bank_type selectByPrimaryKey(String btId);

    int updateByPrimaryKeySelective(Bank_type record);

    int updateByPrimaryKey(Bank_type record);
}