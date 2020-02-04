package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Dull_section;
import com.apatech.domain.Team;

public interface Dull_sectionMapper {
	 List<Dull_section> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Dull_section WHERE ds_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String dsId);

    int insert(Dull_section record);

    int insertSelective(Dull_section record);

    Dull_section selectByPrimaryKey(String dsId);

    int updateByPrimaryKeySelective(Dull_section record);

    int updateByPrimaryKey(Dull_section record);
}