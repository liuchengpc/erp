package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Team;

public interface TeamMapper {
	 @Select("select * from team "
		 		+ "ORDER BY team_id DESC")
		 List<Team> selectAll();
		 
		 @Select("SELECT "+
					"CASE "+
					"WHEN COUNT(*)>98 THEN COUNT(*)+1 "+
					"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1) "+
					"ELSE CONCAT('00',COUNT(*)+1) "+
					"END "+
					"FROM "+
					"tb_bill WHERE billdate=#{billdate}")
	    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String teamId);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(String teamId);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}