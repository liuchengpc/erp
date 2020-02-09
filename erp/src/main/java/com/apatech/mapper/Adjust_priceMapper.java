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
    
    
    @Select("SELECT  adj.ap_dateid,adj.ap_custom6,upd.up_name,upd.up_custom6,\n" + 
    		"    		adj.`ap_doworkman`,adj.`ap_recheckman`,\n" + 
    		"    		mu.mu_name,adj.ap_price,adj.ap_decoration\n" + 
    		"    		FROM adjust_price AS adj,updown_program AS upd,matter AS mat,measurement_unit AS mu\n" + 
    		"    		WHERE adj.materialid=mat.matter_id AND adj.updowmid=upd.up_id AND mat.mu_id=mu.mu_id AND adj.`ap_yn`=0  ORDER BY adj.ap_custom6,adj.ap_dateid DESC")
    List<wd_Adjust_price> wdselectAll();
    
    @Select("SELECT \n" + 
    		" mat.matter_name,mat.matter_id,mat.matter_size,mat.matter_nowcount,mat.matter_nowavgcost,(mat.matter_nowallcost/matter_nowcount)AS onePrice,\n" + 
    		"mu.mu_name,adj.ap_price,adj.ap_decoration\n" + 
    		"FROM adjust_price AS adj,updown_program AS upd,matter AS mat,measurement_unit AS mu \n" + 
    		"WHERE mat.matter_custom6=#{matterCustom6} AND adj.updowmid=upd.up_id AND mat.mu_id=mu.mu_id GROUP BY mat.matter_name\n" + 
    		"")
    List<wd_Adjust_price> queryMater(String matterCustom6);
}