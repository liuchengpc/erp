package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Requisition;
import com.apatech.domain.Team;

public interface RequisitionMapper {
	List<Requisition> selectAll();
	 
	//@Select("SELECT * FROM requisition GROUP BY requisition_documentation_date DESC")
	List<Requisition> queryAllByTime();
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Requisition WHERE requisition_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String requisitionId);

    int insert(Requisition record);

    int insertSelective(Requisition record);

    Requisition selectByPrimaryKey(String requisitionId);

    int updateByPrimaryKeySelective(Requisition record);

    int updateByPrimaryKey(Requisition record);
}