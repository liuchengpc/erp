package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Adjust_price;
import com.apatech.domain.wd_Adjust_price;

public interface Adjust_priceMapper {
	 List<Adjust_price> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Adjust_price WHERE ap_custom1=#{billdate}")
    String getno(@Param("billdate")String billdate);
	
    int deleteByPrimaryKey(String apId);

    int insert(Adjust_price record);

    int insertSelective(Adjust_price record);

    Adjust_price selectByPrimaryKey(String apId);

    int updateByPrimaryKeySelective(Adjust_price record);

    int updateByPrimaryKey(Adjust_price record);
    
    @Select("SELECT \n" + 
    		"adj.ap_dateid,adj.ap_price,adj.ap_decoration,adj.ap_custom1,\n" + 
    		"upd.up_name,upd.up_custom1,\n" + 
    		"mat.matter_name,mat.matter_id,mat.matter_size,mat.matter_nowcount,mat.matter_nowavgcost,(mat.matter_nowallcost/matter_nowcount)AS onePrice,\n" + 
    		"mu.mu_name\n" + 
    		"FROM adjust_price AS adj,updown_program AS upd,matter AS mat,measurement_unit AS mu \n" + 
    		"WHERE adj.materialid=mat.matter_id AND adj.updowmid=upd.up_id AND mat.mu_id=mu.mu_id")
    List<wd_Adjust_price> wdselectAll();
}