package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Payables;
import com.apatech.domain.Team;

public interface PayablesMapper {
	 List<Payables> selectAll();
	 
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Payables WHERE Payables_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String payablesId);

    int insert(Payables record);

    int insertSelective(Payables record);

    Payables selectByPrimaryKey(String payablesId);

    int updateByPrimaryKeySelective(Payables record);

    int updateByPrimaryKey(Payables record);
}