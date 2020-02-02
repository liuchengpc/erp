package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Assessment_procurement;
import com.apatech.domain.Team;

public interface Assessment_procurementMapper {
	 List<Assessment_procurement> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"team WHERE ap_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String apId);

    int insert(Assessment_procurement record);

    int insertSelective(Assessment_procurement record);

    Assessment_procurement selectByPrimaryKey(String apId);

    int updateByPrimaryKeySelective(Assessment_procurement record);

    int updateByPrimaryKey(Assessment_procurement record);
}