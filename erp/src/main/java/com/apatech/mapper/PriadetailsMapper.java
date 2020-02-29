package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Priadetails;
import com.apatech.domain.Team;

public interface PriadetailsMapper {
	 List<Priadetails> selectAll();
	 
	 List<Priadetails> selectByPriabillSupplierName(String priabillId);
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Priadetails WHERE priabill_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String priadetailsId);

    int deleteByPrimaryKeyXuzhe(String priabillId);
    
    int insert(Priadetails record);

    int insertSelective(Priadetails record);

    List<Priadetails> selectByPrimaryKey2(String priabillId);
    
    Priadetails selectByPrimaryKey(String priadetailsId);

    int updateByPrimaryKeySelective(Priadetails record);

    int updateByPrimaryKey(Priadetails record);
    
    int selectCount();
}