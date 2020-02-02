package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Referrece;
import com.apatech.domain.Team;

public interface ReferreceMapper {
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
	
    int deleteByPrimaryKey(String referreceId);

    int insert(Referrece record);

    int insertSelective(Referrece record);

    Referrece selectByPrimaryKey(String referreceId);

    int updateByPrimaryKeySelective(Referrece record);

    int updateByPrimaryKey(Referrece record);
}