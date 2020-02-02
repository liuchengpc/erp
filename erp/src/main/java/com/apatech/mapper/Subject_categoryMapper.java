package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Subject_category;
import com.apatech.domain.Team;

public interface Subject_categoryMapper {
	List<Subject_category> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Subject_category WHERE sc_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String scId);

    int insert(Subject_category record);

    int insertSelective(Subject_category record);

    Subject_category selectByPrimaryKey(String scId);

    int updateByPrimaryKeySelective(Subject_category record);

    int updateByPrimaryKey(Subject_category record);
}