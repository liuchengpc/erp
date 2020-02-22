package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Receivablesdetails;
import com.apatech.domain.Team;

public interface ReceivablesdetailsMapper {
	List<Receivablesdetails> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Receivablesdetails WHERE recedetail_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	 
	 
	List<Receivablesdetails> selectAllpagebyidlc(@Param("receivablesbillId")String receivablesbillId);
	
    int deleteByPrimaryKey(String recedetailId);

    int insert(Receivablesdetails record);

    int insertSelective(Receivablesdetails record);

    Receivablesdetails selectByPrimaryKey(String recedetailId);

    int updateByPrimaryKeySelective(Receivablesdetails record);

    int updateByPrimaryKey(Receivablesdetails record);
}