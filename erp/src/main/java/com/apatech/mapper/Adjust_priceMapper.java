package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.apatech.domain.Adjust_price;
import com.apatech.domain.wd_Adjust_detail;
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
    		"c.d_apid,c.d_matterid,b.up_id ,a.ap_dateid,a.updowmid,a.ap_id,m.mu_id as mamuId 	\n" + 
    		"	\n" + 
    		"FROM adjust_price AS a,\n" + 
    		"	updown_program AS b,\n" + 
    		"	measurement_unit AS m,\n" + 
    		"	adjust_detail AS c,\n" + 
    		"	matter AS ma	\n" + 
    		"WHERE c.d_apid=a.ap_id\n" + 
    		"AND a.`ap_yn`=0 \n" + 
    		"AND a.updowmid=b.up_id \n" + 
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

	@Update("UPDATE updown_program SET\n" + 
			"  `up_id` = #{upId},\n" + 
			"  `up_name` = #{upname},\n" + 
			"  `up_custom5` =#{apDateid} ,\n" + 
			"  `up_custom6` = #{doname} \n" + 
			"WHERE `up_id` =#{updowmid} AND `up_custom5` = #{apDateid}")
	int updatekm(String upId, String upname, String doId, String doname, String updowmid, String apDateid);

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
    
    
}