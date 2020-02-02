package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Purchase_requisition_detailed;
import com.apatech.domain.Team;

public interface Purchase_requisition_detailedMapper {
	List<Purchase_requisition_detailed> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Purchase_requisition_detailed WHERE prd_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String prdId);

    int insert(Purchase_requisition_detailed record);

    int insertSelective(Purchase_requisition_detailed record);

    Purchase_requisition_detailed selectByPrimaryKey(String prdId);

    int updateByPrimaryKeySelective(Purchase_requisition_detailed record);

    int updateByPrimaryKey(Purchase_requisition_detailed record);
}