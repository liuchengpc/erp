package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Invoice_type;
import com.apatech.domain.Team;

public interface Invoice_typeMapper {
	 List<Invoice_type> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Invoice_type WHERE it_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String itId);

    int insert(Invoice_type record);

    int insertSelective(Invoice_type record);

    Invoice_type selectByPrimaryKey(String itId);

    int updateByPrimaryKeySelective(Invoice_type record);

    int updateByPrimaryKey(Invoice_type record);
}