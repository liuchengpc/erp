package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Purchase_jiaoyi;

public interface Purchase_jiaoyiMapper {
 List<Purchase_jiaoyi> selectAll();
	 
 List<Purchase_jiaoyi> selectAllXz(Purchase_jiaoyi jiaoyi);
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"purchase_jiaoyi WHERE jy_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(Integer jyId);

    int deleteByPrimaryKey2(String jyCustom3);
    
    int deleteByPrimaryKey3(String jyNumber);
    
    int insert(Purchase_jiaoyi record);

    int insertSelective(Purchase_jiaoyi record);

    Purchase_jiaoyi selectByPrimaryKey(Integer jyId);

    int updateByPrimaryKeySelective(Purchase_jiaoyi record);

    int updateByPrimaryKey(Purchase_jiaoyi record);
}