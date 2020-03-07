package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Payablesmain;
import com.apatech.domain.Team;

public interface PayablesmainMapper {
	 List<Payablesmain> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Payablesmain WHERE pade_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String payablesmainId);
    
    @Select("select payablesmain_auditing from Payablesmain where payablesmain_sourcelist=#{bitten}")
    String selectbysh(String bitten);

    int insert(Payablesmain record);

    int insertSelective(Payablesmain record);

    Payablesmain selectByPrimaryKey(String payablesmainId);

    int updateByPrimaryKeySelective(Payablesmain record);

    int updateByPrimaryKey(Payablesmain record);
}