package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Priabill;
import com.apatech.domain.Team;

public interface PriabillMapper {
	 List<Priabill> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Priabill WHERE tpriabill_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String priabillId);

    int insert(Priabill record);

    int insertSelective(Priabill record);

    Priabill selectByPrimaryKey(String priabillId);

    int updateByPrimaryKeySelective(Priabill record);

    int updateByPrimaryKey(Priabill record);
}