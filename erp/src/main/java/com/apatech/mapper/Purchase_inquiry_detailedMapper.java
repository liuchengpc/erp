package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Purchase_inquiry_detailed;
import com.apatech.domain.Team;

public interface Purchase_inquiry_detailedMapper {
	 List<Team> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"team WHERE team_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String didId);

    int insert(Purchase_inquiry_detailed record);

    int insertSelective(Purchase_inquiry_detailed record);

    Purchase_inquiry_detailed selectByPrimaryKey(String didId);

    int updateByPrimaryKeySelective(Purchase_inquiry_detailed record);

    int updateByPrimaryKey(Purchase_inquiry_detailed record);
}