package com.apatech.mapper;

import java.util.List;

import javax.validation.constraints.Pattern;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.apatech.domain.Sales_out_warehouse;
import com.apatech.domain.Team;

public interface Sales_out_warehouseMapper {
 List<Sales_out_warehouse> selectAll();
 
	@Select("select count(*) from Sales_out_warehouse")
	int selectcount();
 
 	@Update("update Sales_out_warehouse set sow_yn=1 where sow_id=#{id}")
 	public int deletelist(String id);
 	
 	@Update("update Sales_out_warehouse_detailed set sowd_yn=1 where sow_id=#{id}")
 	public int deletelist2(String id);
 	
 	@Update("update Sales_out_warehouse set sow_auditing=#{sid} where sow_id=#{id}")
 	public int selectlist(@Param("id")String id,@Param("sid")String sid);
 	
 	@Update("update Sales_out_warehouse_detailed set sowd_auditing=#{sid} where sow_id=#{id}")
 	public int selectlist2(@Param("id")String id,@Param("sid")String sid);
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Sales_out_warehouse WHERE sow_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String sowId);

    int insert(Sales_out_warehouse record);

    int insertSelective(Sales_out_warehouse record);

    Sales_out_warehouse selectByPrimaryKey(String sowId);

    int updateByPrimaryKeySelective(Sales_out_warehouse record);

    int updateByPrimaryKey(Sales_out_warehouse record);
}