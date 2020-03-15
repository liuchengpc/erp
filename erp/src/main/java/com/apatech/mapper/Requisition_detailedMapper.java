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
	
	//@Select("SELECT * FROM requisition_detailed WHERE requisition_id=#{requisitionId}")
	List<Requisition_detailed> queryAllByR_ID(String requisitionId); 

    int deleteByPrimaryKey(String rdId);
    int deleteByrequisitionId(String requisitionId);

    int insert(Requisition_detailed record);

    int insertSelective(Requisition_detailed record);
    int insertSelective2(Requisition_detailed record);

    Requisition_detailed selectByPrimaryKey(String rdId);

    int updateByPrimaryKeySelective(Requisition_detailed record);

    int updateByPrimaryKeyWithBLOBs(Requisition_detailed record);

    int updateByPrimaryKey(Requisition_detailed record);
}