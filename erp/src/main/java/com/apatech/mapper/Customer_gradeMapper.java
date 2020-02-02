package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Customer_grade;
import com.apatech.domain.Team;

public interface Customer_gradeMapper {
	 List<Customer_grade> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Customer_grade WHERE og_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String cgId);

    int insert(Customer_grade record);

    int insertSelective(Customer_grade record);

    Customer_grade selectByPrimaryKey(String cgId);

    int updateByPrimaryKeySelective(Customer_grade record);

    int updateByPrimaryKey(Customer_grade record);
}