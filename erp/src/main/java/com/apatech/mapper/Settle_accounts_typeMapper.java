package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Settle_accounts_type;
import com.apatech.domain.Team;

public interface Settle_accounts_typeMapper {
	List<Settle_accounts_type> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Settle_accounts_type WHERE sat_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String satId);

    int insert(Settle_accounts_type record);

    int insertSelective(Settle_accounts_type record);

    Settle_accounts_type selectByPrimaryKey(String satId);

    int updateByPrimaryKeySelective(Settle_accounts_type record);

    int updateByPrimaryKey(Settle_accounts_type record);
}