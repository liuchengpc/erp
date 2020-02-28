package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Priadetails;
import com.apatech.domain.Purchase_payables;
import com.apatech.mapper.Purchase_payablesMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional
public class Purchase_payablesService {
	@Autowired
	private Purchase_payablesMapper dao;
	
	 public PageInfo<Purchase_payables> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Purchase_payables> list=dao.selectAll();

    	PageInfo<Purchase_payables> page=new PageInfo<Purchase_payables>(list);
//	    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public PageInfo<Purchase_payables> selectByPayablesbillSupplierName(Integer page,Integer limit,String ppCustom8){
    	System.out.println("分页的集合："+dao.selectByPayablesbillSupplierName(ppCustom8));
    	PageHelper.startPage(page, limit);
    	List<Purchase_payables> list=dao.selectByPayablesbillSupplierName(ppCustom8);

    	PageInfo<Purchase_payables> pageFy=new PageInfo<Purchase_payables>(list);
    	return pageFy;
     }
	 
	 public PageInfo<Purchase_payables> selectByPayablesbillSupplierName2(Integer page,Integer limit,String ppPcName){
	    	System.out.println("分页的集合："+dao.selectByPayablesbillSupplierName2(ppPcName));
	    	PageHelper.startPage(page, limit);
	    	List<Purchase_payables> list=dao.selectByPayablesbillSupplierName2(ppPcName);

	    	PageInfo<Purchase_payables> pageFy=new PageInfo<Purchase_payables>(list);
	    	return pageFy;
	 }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
	
    public int deleteByPrimaryKey(Integer apId){
    	return dao.deleteByPrimaryKey(apId);    }

    public int insert(Purchase_payables record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_payables record){
    	return dao.insertSelective(record);
    }

    public Purchase_payables selectByPrimaryKey(Integer apId){
    	return dao.selectByPrimaryKey(apId);
    }

    public int updateByPrimaryKeySelective(Purchase_payables record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_payables record){
    	return dao.updateByPrimaryKey(record);
    }
}