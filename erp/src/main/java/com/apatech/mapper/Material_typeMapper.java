package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Material_type;
import com.apatech.domain.Team;

public interface Material_typeMapper {
	 List<Material_type> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Material_type WHERE mt_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String mtId);

    int insert(Material_type record);

    int insertSelective(Material_type record);

    Material_type selectByPrimaryKey(String mtId);

    int updateByPrimaryKeySelective(Material_type record);

    int updateByPrimaryKey(Material_type record);
}