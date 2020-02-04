package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Currency;
import com.apatech.domain.Team;

public interface CurrencyMapper {
	 List<Currency> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Currency WHERE Currency_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String currencyId);

    int insert(Currency record);

    int insertSelective(Currency record);

    Currency selectByPrimaryKey(String currencyId);

    int updateByPrimaryKeySelective(Currency record);

    int updateByPrimaryKey(Currency record);
}