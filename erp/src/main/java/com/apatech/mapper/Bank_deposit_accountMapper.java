package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Bank_deposit_account;
import com.apatech.domain.Team;

public interface Bank_deposit_accountMapper {
	 List<Bank_deposit_account> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Bank_deposit_account WHERE ada_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String adaId);

    int insert(Bank_deposit_account record);

    int insertSelective(Bank_deposit_account record);

    Bank_deposit_account selectByPrimaryKey(String adaId);

    int updateByPrimaryKeySelective(Bank_deposit_account record);

    int updateByPrimaryKey(Bank_deposit_account record);
}