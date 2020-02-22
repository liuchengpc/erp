package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Account;
import com.apatech.domain.Adjust_detail;

public interface Adjust_detailMapper {
	 List<Adjust_detail> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Adjust_detail WHERE adde_custom1=#{billdate}")
   String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(Integer addeId);

    int insert(Adjust_detail record);

    int insertSelective(Adjust_detail record);

    Adjust_detail selectByPrimaryKey(Integer addeId);

    int updateByPrimaryKeySelective(Adjust_detail record);

    int updateByPrimaryKey(Adjust_detail record);
}