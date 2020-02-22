package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Adjust_price;
import com.apatech.domain.Updown_program;
import com.apatech.domain.wd_Adjust_price;
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
    	//System.out.println("分页的集合："+dao.wdselectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);	
    	List<wd_Adjust_price> list=dao.wdselectAll();
    	PageInfo<wd_Adjust_price> page=new PageInfo<wd_Adjust_price>(list	);
//	    	System.out.println("分页的集合2："+page.getList().toString());
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
	 
	 
}
