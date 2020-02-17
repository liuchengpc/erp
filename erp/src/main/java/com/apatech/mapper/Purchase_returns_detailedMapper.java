package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Purchase_returns_detailed;
import com.apatech.domain.Team;

public interface Purchase_returns_detailedMapper {
	List<Purchase_returns_detailed> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Purchase_returns_detailed WHERE pured_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String puredId);

    int insert(Purchase_returns_detailed record);

    int insertSelective(Purchase_returns_detailed record);

    Purchase_returns_detailed selectByPrimaryKey(String puredId);

    int updateByPrimaryKeySelective(Purchase_returns_detailed record);

    int updateByPrimaryKey(Purchase_returns_detailed record);

    Purchase_returns_detailed selectByPureId(@Param("pureId") String pureId);
}