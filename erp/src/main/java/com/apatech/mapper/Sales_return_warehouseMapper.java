package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.apatech.domain.Sales_return_warehouse;
import com.apatech.domain.Team;

public interface Sales_return_warehouseMapper {
	
	@Select("select count(*) from sales_return_warehouse")
	int selectcount();
	
	@Select("select count(*) from sales_return_warehouse where srw_document_date=#{id}")
	int selectcountby(String id);
 
 	@Update("update sales_return_warehouse set srw_yn=1 where srw_id=#{id}")
 	public int deletelist(String id);
 	
 	@Update("update sales_return_warehouse_detailed set srwd_yn=1 where srw_id=#{id}")
 	public int deletelist2(String id);
 	
 	@Update("update sales_return_warehouse set srw_auditing=#{sid} where srw_id=#{id}")
 	public int selectlist(@Param("id")String id,@Param("sid")String sid);
 	
 	@Update("update sales_return_warehouse_detailed set srwd_auditing=#{sid} where srw_id=#{id}")
 	public int selectlist2(@Param("id")String id,@Param("sid")String sid);
	
	
	List<Sales_return_warehouse> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Sales_return_warehouse WHERE srw_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String srwId);

    int insert(Sales_return_warehouse record);

    int insertSelective(Sales_return_warehouse record);

    Sales_return_warehouse selectByPrimaryKey(String srwId);

    int updateByPrimaryKeySelective(Sales_return_warehouse record);

    int updateByPrimaryKey(Sales_return_warehouse record);
}