package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Out_storage_type;
import com.apatech.domain.Team;

public interface Out_storage_typeMapper {
	 List<Out_storage_type> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Out_storage_type WHERE ost_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String ostId);

    int insert(Out_storage_type record);

    int insertSelective(Out_storage_type record);

    Out_storage_type selectByPrimaryKey(String ostId);

    int updateByPrimaryKeySelective(Out_storage_type record);

    int updateByPrimaryKey(Out_storage_type record);
}