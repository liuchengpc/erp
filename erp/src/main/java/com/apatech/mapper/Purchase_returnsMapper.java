package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Purchase_returns;
import com.apatech.domain.Team;

public interface Purchase_returnsMapper {
	List<Purchase_returns> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Purchase_returns WHERE pure_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String pureId);

    int insert(Purchase_returns record);

    int insertSelective(Purchase_returns record);

    Purchase_returns selectByPrimaryKey(String pureId);

    int updateByPrimaryKeySelective(Purchase_returns record);

    int updateByPrimaryKey(Purchase_returns record);
}