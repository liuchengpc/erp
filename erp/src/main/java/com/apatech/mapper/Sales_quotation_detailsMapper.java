package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Sales_quotation_details;
import com.apatech.domain.Team;

public interface Sales_quotation_detailsMapper {
	List<Sales_quotation_details> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Sales_quotation_details WHERE sqd_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);

	 List<Sales_quotation_details> querybysqlid(String sqlId);
	 
    int deleteByPrimaryKey(String sqdId);

    int insert(Sales_quotation_details record);

    int insertSelective(Sales_quotation_details record);

    Sales_quotation_details selectByPrimaryKey(String sqdId);

    int updateByPrimaryKeySelective(Sales_quotation_details record);

    int updateByPrimaryKey(Sales_quotation_details record);
}