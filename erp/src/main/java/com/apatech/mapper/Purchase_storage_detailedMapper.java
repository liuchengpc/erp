package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Purchase_storage_detailed;
import com.apatech.domain.Team;

public interface Purchase_storage_detailedMapper {
	List<Purchase_storage_detailed> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Purchase_storage_detailed WHERE psd_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String psdId);

    int insert(Purchase_storage_detailed record);

    int insertSelective(Purchase_storage_detailed record);

    Purchase_storage_detailed selectByPrimaryKey(String psdId);

    int updateByPrimaryKeySelective(Purchase_storage_detailed record);

    int updateByPrimaryKey(Purchase_storage_detailed record);
}