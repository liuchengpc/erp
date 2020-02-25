package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Matter;
import com.apatech.domain.Team;
import com.apatech.domain.wdMatter;

public interface MatterMapper {
	 List<wdMatter> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Matter WHERE Matter_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String matterId);

    int insert(Matter record);

    int insertSelective(Matter record);

    Matter selectByPrimaryKey(String matterId);

    int updateByPrimaryKeySelective(Matter record);

    int updateByPrimaryKey(Matter record);

    @Select("SELECT \n" + 
    		"ma.matter_id AS matterId,ma.matter_name AS mmatterName,\n" + 
    		"m.mu_id AS mamuId,ma.matter_size AS mmatterSize,\n" + 
    		"m.mu_name AS muName,\n" + 
    		"ma.matter_nowcount AS mmatterNowcount,\n" + 
    		"ma.matter_nowavgcost AS mmatterNowavgcost,\n" + 
    		"(ma.matter_nowallcost/ma.matter_nowcount)AS mmonePrice	\n" + 
    		"FROM \n" + 
    		"	measurement_unit AS m,\n" + 
    		"	matter AS ma	\n" + 
    		"WHERE ma.mu_id=m.mu_id")
	List<wdMatter> selectAllMatter();
}