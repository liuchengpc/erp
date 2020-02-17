package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Team;
import com.apatech.domain.Updown_program;

public interface Updown_programMapper {
 List<Updown_program> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Updown_program WHERE up_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String upId);

    int insert(Updown_program record);

    int insertSelective(Updown_program record);

    Updown_program selectByPrimaryKey(String upId);

    int updateByPrimaryKeySelective(Updown_program record);

    int updateByPrimaryKey(Updown_program record);
    
    @Select("select * from Updown_program")
    List<Updown_program>selectkm();
}