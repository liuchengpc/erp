package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Adjust_price;
import com.apatech.domain.wd_Adjust_price;
import com.apatech.domain.Adjust_price;
import com.apatech.mapper.Adjust_priceMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional
public class Adjust_priceService {
	@Autowired
	private Adjust_priceMapper dao;
	
	 public PageInfo<Adjust_price> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Adjust_price> list=dao.selectAll();

    	PageInfo<Adjust_price> page=new PageInfo<Adjust_price>(list);
//	    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String apId){
    	return dao.deleteByPrimaryKey(apId);    }

    public int insert(int apId,String apDateid,String updownmid,String apdoworkman,String apRecheckman,String apAuditing,String apYn,String apCustom6){
    	return dao.inserts(apId,apDateid,updownmid,apdoworkman,apRecheckman,apAuditing,apYn,apCustom6);
    }
    
    public int insertSelective(Adjust_price record){
    	return dao.insertSelective(record);
    }

    public Adjust_price selectByPrimaryKey(String apId){
    	return dao.selectByPrimaryKey(apId);
    }

    public int updateByPrimaryKeySelective(Adjust_price record){
    	return dao.updateByPrimaryKeySelective(record);
    }
    public int wdupdateByPrimaryKeySelective(String apDateid){
    	System.out.println(apDateid);
    	return dao.updateByPrimaryKeySelectives(apDateid);
    }
    public int updateByPrimaryKey(Adjust_price record){
    	return dao.updateByPrimaryKey(record);
    }

	public int insertupd(String updownmid, String upname, String apId, String doname) {
		return dao.insertupd(updownmid,upname,apId,doname);
		// TODO Auto-generated method stub
		
	}

	
}