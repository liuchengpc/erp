package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.apatech.domain.Sales_return_warehouse_detailed;


public interface Sales_return_warehouse_detailedMapper {
 List<Sales_return_warehouse_detailed> selectAll();
 
 @Select("select count(*) from Sales_return_warehouse_detailed")
	int selectcount();
	
	
	List<Sales_return_warehouse_detailed> selectlist(String id);
	
	@Update("update Sales_return_warehouse_detailed set srwd_yn=1 WHERE srw_id=#{id}")
	int deletelist(String id);
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Sales_return_warehouse_detailed WHERE srwd_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String srwdId);

    int insert(Sales_return_warehouse_detailed record);

    int insertSelective(Sales_return_warehouse_detailed record);

    Sales_return_warehouse_detailed selectByPrimaryKey(String srwdId);

    int updateByPrimaryKeySelective(Sales_return_warehouse_detailed record);

    int updateByPrimaryKey(Sales_return_warehouse_detailed record);
}