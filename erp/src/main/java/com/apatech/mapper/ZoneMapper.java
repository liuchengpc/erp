package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Team;
import com.apatech.domain.Zone;

public interface ZoneMapper {
	List<Zone> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Zone WHERE Zone_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String zoneId);

    int insert(Zone record);

    int insertSelective(Zone record);

    Zone selectByPrimaryKey(String zoneId);

    int updateByPrimaryKeySelective(Zone record);

    int updateByPrimaryKey(Zone record);
}