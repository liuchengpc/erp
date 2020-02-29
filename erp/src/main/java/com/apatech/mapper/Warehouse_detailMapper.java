package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Team;
import com.apatech.domain.Warehouse_detail;

public interface Warehouse_detailMapper {
	List<Warehouse_detail> selectAll();
	 
	@Select("select * from Warehouse_detail where warehouse_id=#{id} and mt_id=#{sid} ORDER BY wd_id DESC LIMIT 0,1")
	Warehouse_detail selectbyid(@Param("id")String id,@Param("sid")String sid);
	
	@Select("select count(*) from Warehouse_detail")
	int selectcount();
	
	@Delete("delete from Warehouse_detail where wd_custom1=#{sj}")
	int deletebysj(String sj);
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Warehouse_detail WHERE wd_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String wdId);

    int insert(Warehouse_detail record);

    int insertSelective(Warehouse_detail record);

    Warehouse_detail selectByPrimaryKey(String wdId);

    int updateByPrimaryKeySelective(Warehouse_detail record);

    int updateByPrimaryKey(Warehouse_detail record);
}