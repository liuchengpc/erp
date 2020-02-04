package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Tax_items;
import com.apatech.domain.Team;

public interface Tax_itemsMapper {
	
 List<Tax_items> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Tax_items WHERE ti_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String tiId);

    int insert(Tax_items record);

    int insertSelective(Tax_items record);

    Tax_items selectByPrimaryKey(String tiId);

    int updateByPrimaryKeySelective(Tax_items record);

    int updateByPrimaryKey(Tax_items record);
}