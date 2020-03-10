package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Adjust_price;
import com.apatech.domain.Updown_program;
import com.apatech.domain.wdQueryTaiz;
import com.apatech.domain.wdQueryTaizDetail;
import com.apatech.domain.wd_Adjust_detail;
import com.apatech.domain.wd_Adjust_price;
import com.apatech.domain.wd_inorout;
import com.apatech.mapper.Adjust_priceMapper;
import com.apatech.mapper.Updown_programMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class wd_Adjust_priceService {
	@Autowired
	private Adjust_priceMapper dao;
	
	@Autowired
	Updown_programMapper udao;
	
 	public PageInfo<wd_Adjust_price> wdselectAllpage(Integer pageNum,Integer pageSize){
	 		System.out.println("分页的集合："+dao.selectAll().toString());
	 	PageHelper.startPage(pageNum, pageSize);	
    	List<wd_Adjust_price> list=dao.wdselectAll();
    	PageInfo<wd_Adjust_price> page=new PageInfo<wd_Adjust_price>(list);
    	return page;
    }
	 
	 public List<wd_Adjust_price> queryMater(String matterCustom6){
	    
	    	List<wd_Adjust_price> list=dao.queryMater(matterCustom6);
	    	
	    	return list;
	    }

	public int selectcount() {
		// TODO Auto-generated method stub
		return dao.selectcount();
	}
	
	public int updateByPrimaryKeySelective(wd_Adjust_price record) {
		System.out.println("订单id"+record.getApDateid());
		int i=dao.updateAdjustByApDateId(record);
		return 0;
		
	}

	public List<Updown_program> selectkm() {
		System.out.println("查询");
		return udao.selectkm();
	}

	

	public int wdupdatekm(String  up_name,String up_custom6, String apDateid) {
		//查询增值科目
		String upkm=dao.selectzzkm(up_name);
		//查询兼职科目
		String downkm=dao.selectjzkm(up_custom6);
		return dao.wdupdatekm(upkm,downkm,apDateid);
	}

	public int updateAuding(String record) {
		System.out.println("订单id"+record);
		return dao.updateAuding(record);
	}
	
	public int deupdateAuding(String record) {
		System.out.println("订单id"+record);
		return dao.deupdateAuding(record);
	}

	public int updateByPrimaryKeySelectives(String apDateId) {
		System.out.println("订单id"+apDateId);
		return  dao.updateByPrimaryKeySelectives(apDateId);
		
	}

	public int wdupdateByPrimaryKeySelective(wd_Adjust_price record) {
		
		return dao.updateAdjustByApDateId(record);
	}

	public List<wd_Adjust_detail> selectlist(String apDateid) {
		System.out.println("apdateid----------:"+dao.selectlist(apDateid).toString());
		return dao.selectlist(apDateid);
	}

	public int inserts(String dMatterid,String dAdjustprice,String dDecoration,String dApId) {
		return dao.insertlist(dMatterid,dAdjustprice,dDecoration,dApId);
		
	}

	
	

	public int updatelist(String ApDateid,String updowmid) {
		return dao.updatelist(ApDateid,updowmid);
	}

	public int updatekm( String upname, String doname, String updowmid, String apDateid) {
		// TODO Auto-generated method stub
		return dao.updatekm(upname,doname,updowmid,apDateid);
	}

	public int updateprice(String dadjustprice,String dDecoration, String dMatterid,String apid) {
		// TODO Auto-generated method stub
		return dao.updateprice(dadjustprice,dDecoration,dMatterid,apid);
	}

	public int updatepeople(String apdoworkman, String apRecheckman,String apDateid) {
		
		return dao.updatepeople(apdoworkman,apRecheckman,apDateid);
	}

	public int delkm(String upId, String apDateid) {
		
		return dao.delkm(upId,apDateid);
	}

	public int updateMoney(String dAdjustprice,String dMatterid) {
		return dao.updateMoney(dAdjustprice,dMatterid);
		
	}

	public List<wdQueryTaiz> doQueryTaiz(String matterBegin, String matterEnd, String warehouseBegin,
			String warehouseEnd, String dateBegin, String dateEnd) {
				System.out.println("进");
		
		return dao.doQueryTaiz(matterBegin,matterEnd,warehouseBegin,warehouseEnd,dateBegin,dateEnd);
	}
	
	public List<wdQueryTaiz> doQueryTaizAll() {
				System.out.println("进");
		return dao.doQueryTaizAll();
	}

	public List<wd_inorout> selinorout() {
		// TODO Auto-generated method stub
		return dao.selinorout();
	}

	public List<wd_inorout> selinoroutDetail(String matterId, String warehouseName, String wdDate) {
		// TODO Auto-generated method stub
		return dao.selinoroutDetail(matterId,warehouseName,wdDate);
	}

	public List<wdQueryTaiz> tzqueryMatter() {
		// TODO Auto-generated method stub
		return dao.tzqueryMatter();
	}

	public List<wdQueryTaiz> tzqueryWarehouse() {
		// TODO Auto-generated method stub
		return dao.tzqueryWarehouse();
	}

	public List<wdQueryTaizDetail> queryNum(String matterId, String warehouseId) {
		System.out.println("matterId="+matterId+"warehouseId="+warehouseId);
		// TODO Auto-generated method stub
		return dao.queryNum(matterId,warehouseId);
	}
	 
	 
}
