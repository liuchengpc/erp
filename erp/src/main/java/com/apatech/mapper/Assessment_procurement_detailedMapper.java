package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Assessment_procurement_detailed;

public interface Assessment_procurement_detailedMapper {
	 List<Assessment_procurement_detailed> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Assessment_procurement_detailed WHERE apd_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String apdId);

    int insert(Assessment_procurement_detailed record);

    int insertSelective(Assessment_procurement_detailed record);

    Assessment_procurement_detailed selectByPrimaryKey(String apdId);

    int updateByPrimaryKeySelective(Assessment_procurement_detailed record);

    int updateByPrimaryKey(Assessment_procurement_detailed record);
}