package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Receivable;
import com.apatech.domain.Team;

public interface ReceivableMapper {
	List<Receivable> selectAll();
	
	List<Receivable> selectAlllc(String payablesCustom2);
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Receivable WHERE payables_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String receivableId);

    int insert(Receivable record);

    int insertSelective(Receivable record);

    Receivable selectByPrimaryKey(String receivableId);

    int updateByPrimaryKeySelective(Receivable record);

    int updateByPrimaryKey(Receivable record);
}