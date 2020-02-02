package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Team;
import com.apatech.domain.subject_blanket_category;

public interface subject_blanket_categoryMapper {
 List<subject_blanket_category> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"subject_blanket_category WHERE sbc_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String sbcId);

    int insert(subject_blanket_category record);

    int insertSelective(subject_blanket_category record);

    subject_blanket_category selectByPrimaryKey(String sbcId);

    int updateByPrimaryKeySelective(subject_blanket_category record);

    int updateByPrimaryKey(subject_blanket_category record);
}