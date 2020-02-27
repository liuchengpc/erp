package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Check_detailed;

public interface Check_detailedMapper {
	 List<Check_detailed> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Check_detailed WHERE cd_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
	List<Check_detailed> selectAllBycheckId(String checkId);
	 
    int deleteByPrimaryKey(String cdId);

    int insert(Check_detailed record);

    int insertSelective(Check_detailed record);

    Check_detailed selectByPrimaryKey(String cdId);

    int updateByPrimaryKeySelective(Check_detailed record);

    int updateByPrimaryKey(Check_detailed record);
}