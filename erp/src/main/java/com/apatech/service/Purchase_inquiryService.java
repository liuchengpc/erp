package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_inquiry;
import com.apatech.domain.Purchase_inquiry;
import com.apatech.domain.Purchase_inquiry;
import com.apatech.mapper.Purchase_inquiryMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Purchase_inquiryService {
	@Autowired
	private Purchase_inquiryMapper dao;
	
	public PageInfo<Purchase_inquiry> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Purchase_inquiry> list=dao.selectAll();

    	PageInfo<Purchase_inquiry> page=new PageInfo<Purchase_inquiry>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String piId){
    	return dao.deleteByPrimaryKey(piId);
    }

    public int insert(Purchase_inquiry record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_inquiry record){
    	return dao.insertSelective(record);
    }

    public Purchase_inquiry selectByPrimaryKey(String piId){
    	return dao.selectByPrimaryKey(piId);
    }

    public int updateByPrimaryKeySelective(Purchase_inquiry record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_inquiry record){
    	return dao.updateByPrimaryKey(record);
    }
}