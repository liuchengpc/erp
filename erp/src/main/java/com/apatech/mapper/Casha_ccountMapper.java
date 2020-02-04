package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Casha_ccount;

public interface Casha_ccountMapper {
	 List<Casha_ccount> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Casha_ccount WHERE cc_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String ccId);

    int insert(Casha_ccount record);

    int insertSelective(Casha_ccount record);

    Casha_ccount selectByPrimaryKey(String ccId);

    int updateByPrimaryKeySelective(Casha_ccount record);

    int updateByPrimaryKey(Casha_ccount record);
}