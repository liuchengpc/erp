package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Purchase_storage;
import com.apatech.domain.Team;

public interface Purchase_storageMapper {
 List<Purchase_storage> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Purchase_storage WHERE ps_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String psId);

    int insert(Purchase_storage record);

    int insertSelective(Purchase_storage record);

    Purchase_storage selectByPrimaryKey(String psId);

    int updateByPrimaryKeySelective(Purchase_storage record);

    int updateByPrimaryKey(Purchase_storage record);
}