package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Requisition_detailed;
import com.apatech.domain.Team;

public interface Requisition_detailedMapper {
 List<Requisition_detailed> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Requisition_detailed WHERE rd_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String rdId);

    int insert(Requisition_detailed record);

    int insertSelective(Requisition_detailed record);

    Requisition_detailed selectByPrimaryKey(String rdId);

    int updateByPrimaryKeySelective(Requisition_detailed record);

    int updateByPrimaryKeyWithBLOBs(Requisition_detailed record);

    int updateByPrimaryKey(Requisition_detailed record);
}