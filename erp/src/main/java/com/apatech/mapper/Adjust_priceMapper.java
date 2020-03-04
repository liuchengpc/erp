package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.apatech.domain.Adjust_price;
import com.apatech.domain.wdQueryTaiz;
import com.apatech.domain.wdQueryTaizDetail;
import com.apatech.domain.wd_Adjust_detail;
import com.apatech.domain.wd_Adjust_price;
import com.apatech.domain.wd_inorout;

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
    		" mat.matter_name,mat.matter_id,mat.matter_size,mat.matter_nowcount,mat.matter_nowavgcost,(mat.matter_nowallcost/matter_nowcount)AS onePrice,\n" + 
    		"mu.mu_name,adj.ap_price,adj.ap_decoration\n" + 
    		"FROM adjust_price AS adj,updown_program AS upd,matter AS mat,measurement_unit AS mu \n" + 
    		"WHERE mat.matter_custom6=#{matterCustom6} AND adj.updowmid=upd.up_id AND mat.mu_id=mu.mu_id GROUP BY mat.matter_name\n" + 
    		"")
    List<wd_Adjust_price> queryMater(String matterCustom6);
    
    @Update("UPDATE `adjust_price` SET ap_yn=1 WHERE ap_dateid=#{apDateid}")
    int updateByPrimaryKeySelectives (String apDateid);

    @Select("SELECT COUNT(*) FROM adjust_price")
	int selectcount();

    @Update("UPDATE adjust_price SET  ap_price = #{apPrice}, ap_decoration = #{apDecoration},  ap_doworkman = #{apDoworkman}, \n" + 
    		"ap_recheckman = #{apRecheckman}, ap_auditing = #{apAuditing}, ap_yn = 0, ap_custom5 = #{apCustom5},ap_custom6 = #{apCustom6} where ap_dateid = #{apDateid}")
	int updateAdjustByApDateId(wd_Adjust_price record);

    
    @Update("UPDATE  updown_program SET up_name = #{upkm}, up_yn = 0, up_custom6 = #{downkm}  WHERE up_custom5 = #{apDateid} ")
	int wdupdatekm(@Param("upkm") String  upkm,@Param("downkm") String downkm,@Param("apDateid") String apDateid);
    
    
    @Update("UPDATE `adjust_price` SET ap_auditing=1 WHERE ap_dateid=#{apDateid}")
	int updateAuding(String record);
    
    @Update("UPDATE `adjust_price` SET ap_auditing=0 WHERE ap_dateid=#{apDateid}")
   	int deupdateAuding(String record);

    @Select("select up_custom4 from updown_program where up_custom3=#{up_name}")
	String selectzzkm(String up_name);
    
    @Select("select up_custom4 from updown_program where up_custom3=#{up_custom6}")
	String selectjzkm(String up_custom6);
   
    
   //查询主单
    @Select("SELECT a.ap_id,a.`ap_dateid`,a.`updowmid`,a.`ap_doworkman`,a.`ap_recheckman`,a.`ap_auditing`,a.`ap_yn`,a.`ap_custom6`,\n" + 
    		"b.up_id,b.`up_name`,b.`up_auditing`,b.`up_yn`,b.`up_custom3`,b.`up_custom4`,b.`up_custom5`,b.`up_custom6`\n" + 
    		"FROM adjust_price AS a,updown_program AS b WHERE a.`ap_yn`=0 And a.updowmid=b.up_id ORDER BY a.ap_dateid DESC")
    List<wd_Adjust_price> wdselectAll();
    
    
    //查询详单
    @Select("SELECT a.ap_dateid,a.ap_custom6,b.up_name,b.up_custom6,\n" + 
    		"ma.matter_name as mmatterName,ma.matter_id,m.mu_name,ma.matter_size as mmatterSize,ma.matter_nowcount as mmatterNowcount,"
    		+ "ma.matter_nowavgcost as mmatterNowavgcost,(ma.matter_nowallcost/ma.matter_nowcount)AS mmonePrice, c.d_adjustprice,c.d_decoration,\n" + 
    		"a.`ap_doworkman`,a.`ap_recheckman`,\n" + 
    		"\n" + 
    		"c.d_apid,c.d_matterid,b.up_id ,a.ap_dateid,a.updowmid,a.ap_id as apId,m.mu_id as mamuId 	\n" + 
    		"	\n" + 
    		"FROM adjust_price AS a,\n" + 
    		"	updown_program AS b,\n" + 
    		"	measurement_unit AS m,\n" + 
    		"	adjust_detail AS c,\n" + 
    		"	matter AS ma	\n" + 
    		"WHERE c.d_apid=a.ap_id\n" + 
    		"AND a.`ap_yn`=0 \n" + 
    		"AND ma.matter_id=c.d_matterid\n" + 
    		"AND a.ap_dateid=b.up_custom5 \n" + 
    		"AND ma.mu_id=m.mu_id "
    		+ "AND a.ap_dateid= #{apDateid}")
	List<wd_Adjust_detail> selectlist(String apDateid);

	@Insert("INSERT INTO adjust_price(ap_id,ap_dateid,updowmid,ap_doworkman,ap_recheckman,ap_auditing,ap_yn,ap_custom6)\n" + 
			"		VALUE(#{apId},#{apDateid},#{updownmid},#{apdoworkman},#{apRecheckman},#{apAuditing},#{apYn},#{apCustom6})")
	int inserts(@Param("apId") int apId, @Param("apDateid") String apDateid, @Param("updownmid") String updownmid, 
			@Param("apdoworkman") String apdoworkman, @Param("apRecheckman") String apRecheckman,
			@Param("apAuditing") String apAuditing, @Param("apYn") String apYn, @Param("apCustom6") String apCustom6);

	@Insert("INSERT INTO adjust_detail(d_matterid,d_adjustprice,d_decoration,d_apid)\n" + 
			"		VALUE(#{dMatterid},#{dAdjustprice},#{dDecoration},#{dApId})")
	int insertlist(@Param("dMatterid") String dMatterid,@Param("dAdjustprice") String dAdjustprice,
			@Param("dDecoration") String dDecoration,@Param("dApId") String dApId);

	
	@Update("update adjust_price set\n" + 
			"  updowmid = #{updowmid} where ap_id = #{apDateid}")
	int updatelist(@Param("apDateid") String apDateid, @Param("updowmid") String updowmid);

	@Update("update  updown_program set  `up_name` = #{upname}, `up_custom6` = #{doname} \n" + 
			"WHERE `up_id` =#{upIds} AND `up_custom5` = #{apDateid}")
	int updatekm(@Param("upname")String upname, @Param("doname")String doname, @Param("upIds")String upIds, @Param("apDateid")String apDateid);

	@Update("UPDATE adjust_detail SET\n" + 
			"  `d_adjustprice` = #{dadjustprice},\n" + 
			"  `d_decoration` = #{dDecoration}\n" + 
			"   \n" + 
			"WHERE `d_matterid` = #{dMatterid} AND `d_apid`=#{apid}")
	int updateprice(@Param("dadjustprice") String dadjustprice,@Param("dDecoration") String dDecoration, @Param("dMatterid") String dMatterid,@Param("apid") String apid);

	@Insert("INSERT INTO updown_program (\n" + 
			"  `up_id`,`up_name`,`up_auditing`,`up_yn`,\n" + 
			"  `up_custom1`,`up_custom5`,`up_custom6`\n" + 
			") \n" + 
			"VALUES\n" + 
			"  (#{updownmid},#{upname},'0','0','1',#{apId},#{doname})")
	int insertupd(@Param("updownmid") String updownmid,@Param("upname")  String upname, @Param("apId") String apId, @Param("doname") String doname);

	@Update("UPDATE adjust_price SET\n" + 
			"  `ap_doworkman` = #{apdoworkman},\n" + 
			"  `ap_recheckman` = #{apRecheckman}\n" + 
			"WHERE `ap_dateid` =#{apDateid} ")
	int updatepeople(@Param("apdoworkman") String apdoworkman,@Param("apRecheckman") String apRecheckman,@Param("apDateid") String apDateid);

	@Delete("delete from updown_program where up_id=#{upId} and up_custom5=#{apDateid}")
	int delkm(@Param("upId") String upId,@Param("apDateid") String apDateid);

	@Update("UPDATE matter SET\n" + 
			"  matter_nowallcost = matter_nowcount * #{dAdjustprice}\n" + 
			" \n" + 
			"WHERE `matter_id` = #{dMatterid}")
	int updateMoney(String dAdjustprice,String dMatterid);

	@Select("SELECT m.matter_id AS matterId,m.matter_name AS matterName, m.matter_size AS matterSize,mt.mt_name AS mtName,mu.mu_name AS muName,w.warehouse_id AS warehouseId,w.warehouse_name AS warehouseName,wd.wd_lastbalancenumber AS wdLastbalancenumber\n" + 
			"	FROM matter AS m,measurement_unit AS mu,warehouse AS w,material_type AS mt,warehouse_detail AS wd\n" + 
			"	WHERE m.mu_id=mu.mu_id AND w.warehouse_id=wd.warehouse_id AND m.matter_id=wd.mt_id AND m.mt_id=mt.mt_id\n" + 
			"	AND m.matter_id BETWEEN(SELECT matter_id FROM matter WHERE matter_name=#{matterBegin}) AND (SELECT matter_id FROM matter WHERE matter_name=#{matterEnd})\n" + 
			"	OR m.matter_id BETWEEN(SELECT matter_id FROM matter WHERE matter_name=#{matterEnd}) AND (SELECT matter_id FROM matter WHERE matter_name=#{matterBegin})\n" + 
			"	OR wd.warehouse_id BETWEEN(SELECT warehouse_id FROM warehouse WHERE warehouse_name=#{warehouseBegin})AND (SELECT warehouse_id FROM warehouse WHERE warehouse_name=#{warehouseEnd})\n" + 
			"	AND wd.warehouse_id BETWEEN(SELECT warehouse_id FROM warehouse WHERE warehouse_name=#{warehouseEnd})AND (SELECT warehouse_id FROM warehouse WHERE warehouse_name=#{warehouseBegin})\n" + 
			"	AND wd.wd_custom1 BETWEEN #{dateBegin} AND #{dateEnd}\n" + 
			"GROUP BY m.matter_id,wd.warehouse_id")
	List<wdQueryTaiz> doQueryTaiz(@Param("matterBegin")String matterBegin,@Param("matterEnd") String matterEnd,
			@Param("warehouseBegin") String warehouseBegin, @Param("warehouseEnd")String warehouseEnd,
			@Param("dateBegin")String dateBegin,@Param("dateEnd") String dateEnd);
	
	
	@Select("SELECT m.matter_id AS matterId,m.matter_name AS matterName, \n" + 
			"	m.matter_size AS matterSize,mt.mt_name AS mtName,\n" + 
			"	mu.mu_name AS muName,w.warehouse_id AS warehouseId,\n" + 
			"	w.warehouse_name AS warehouseName,wd.wd_lastbalancenumber AS wdLastbalancenumber\n" + 
			"	FROM matter AS m,\n" + 
			"	measurement_unit AS mu, \n" + 
			"	warehouse AS w,\n" + 
			"	material_type AS mt,\n" + 
			"	warehouse_detail AS wd\n" + 
			"	WHERE m.mu_id=mu.mu_id \n" + 
			"	AND w.warehouse_id=wd.warehouse_id\n" + 
			"	AND m.matter_id=wd.mt_id\n" + 
			"	AND m.mt_id=mt.mt_id\n" + 
			"	GROUP BY wd.warehouse_id, m.matter_id")
	List<wdQueryTaiz> doQueryTaizAll();

	@Select("SELECT m.matter_id AS matterId,m.matter_name AS matterName, \n" + 
			"	w.warehouse_name AS warehouseName,wd.wd_custom1 AS wdDate\n" + 
			"	FROM matter AS m,\n" + 
			"	measurement_unit AS mu, \n" + 
			"	warehouse AS w,\n" + 
			"	material_type AS mt,\n" + 
			"	warehouse_detail AS wd\n" + 
			"	WHERE m.mu_id=mu.mu_id \n" + 
			"	AND w.warehouse_id=wd.warehouse_id\n" + 
			"	AND m.matter_id=wd.mt_id\n" + 
			"	AND m.mt_id=mt.mt_id\n" + 
			"	ORDER BY wd.wd_custom1 DESC")
	List<wd_inorout> selinorout();

	@Select("SELECT wd.wd_custom1 AS wdDate,m.matter_id AS matterId,m.matter_name AS matterName,\n" + 
			"m.matter_size AS matterSize,mt.mt_name AS mtName,mu.mu_name AS muName, \n" + 
			"	w.warehouse_name AS warehouseName,wd.wd_inorout AS wdInorout,wd.wd_unit_rice AS wdUnitRice,\n" + 
			"	wd.wd_number AS wdNumber\n" + 
			"	FROM matter AS m,\n" + 
			"	measurement_unit AS mu, \n" + 
			"	warehouse AS w,\n" + 
			"	material_type AS mt,\n" + 
			"	warehouse_detail AS wd\n" + 
			"	WHERE m.mu_id=mu.mu_id \n" + 
			"	AND w.warehouse_id=wd.warehouse_id\n" + 
			"	AND m.matter_id=wd.mt_id\n" + 
			"	AND m.mt_id=mt.mt_id\n" + 
			"	AND m.matter_id=#{matterId}\n" + 
			"	AND w.warehouse_name=#{warehouseName}\n" + 
			"	AND wd.wd_custom1=#{wdDate}\n" + 
			"	ORDER BY wd.wd_custom1 DESC")
	List<wd_inorout> selinoroutDetail(@Param("matterId") String matterId,  @Param("warehouseName") String warehouseName, @Param("wdDate") String wdDate);

	@Select("select matter_id AS matterId,matter_name AS matterName from matter")
	List<wdQueryTaiz> tzqueryMatter();

	@Select("select warehouse_id AS warehouseId,warehouse_name AS warehouseName from warehouse")
	List<wdQueryTaiz> tzqueryWarehouse();

	@Select("SELECT\n" + 
			" (SELECT SUM(c.wd_number) FROM matter AS m,warehouse AS b,warehouse_detail AS c WHERE c.wd_inorout=0 \n" + 
			" AND b.warehouse_id=c.warehouse_id AND m.matter_id=c.mt_id AND c.`warehouse_id`=#{warehouseId} AND c.`mt_id`=#{matterId}\n" + 
			" )AS inNum, \n" + 
			" (SELECT SUM(c.wd_number) FROM matter AS m,warehouse AS b,warehouse_detail AS c WHERE c.wd_inorout=1 \n" + 
			" AND b.warehouse_id=c.warehouse_id AND m.matter_id=c.mt_id AND c.`warehouse_id`=#{warehouseId} AND c.`mt_id`=#{matterId}\n" + 
			" )AS outNum \n" + 
			"FROM matter AS m,warehouse AS b,warehouse_detail AS c\n" + 
			"WHERE c.warehouse_id=b.warehouse_id AND m.`matter_id`=c.mt_id AND c.warehouse_id=#{warehouseId} AND c.`mt_id`=#{matterId}\n" + 
			"GROUP BY  c.`mt_id`")
	List<wdQueryTaizDetail> queryNum(String matterId, String warehouseId);
    
    
}