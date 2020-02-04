package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Matter;
import com.apatech.domain.Team;

public interface MatterMapper {
	 List<Matter> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Matter WHERE Matter_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String matterId);

    int insert(Matter record);

    int insertSelective(Matter record);

    Matter selectByPrimaryKey(String matterId);

    int updateByPrimaryKeySelective(Matter record);

    int updateByPrimaryKey(Matter record);
}