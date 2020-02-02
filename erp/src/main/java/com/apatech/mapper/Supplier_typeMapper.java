package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Supplier_type;
import com.apatech.domain.Team;

public interface Supplier_typeMapper {
	List<Supplier_type> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Supplier_type WHERE st_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String stId);

    int insert(Supplier_type record);

    int insertSelective(Supplier_type record);

    Supplier_type selectByPrimaryKey(String stId);

    int updateByPrimaryKeySelective(Supplier_type record);

    int updateByPrimaryKey(Supplier_type record);
}