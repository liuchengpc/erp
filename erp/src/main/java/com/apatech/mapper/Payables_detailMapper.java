package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Payables_detail;
import com.apatech.domain.Team;

public interface Payables_detailMapper {
	 List<Payables_detail> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Payables_detail WHERE pade_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String paydetailId);

    int insert(Payables_detail record);

    int insertSelective(Payables_detail record);

    Payables_detail selectByPrimaryKey(String paydetailId);

    int updateByPrimaryKeySelective(Payables_detail record);

    int updateByPrimaryKey(Payables_detail record);
}