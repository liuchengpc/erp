package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Team;
import com.apatech.domain.Warehouse_detail;

public interface Warehouse_detailMapper {
	List<Warehouse_detail> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Warehouse_detail WHERE wd_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String wdId);

    int insert(Warehouse_detail record);

    int insertSelective(Warehouse_detail record);

    Warehouse_detail selectByPrimaryKey(String wdId);

    int updateByPrimaryKeySelective(Warehouse_detail record);

    int updateByPrimaryKey(Warehouse_detail record);
}