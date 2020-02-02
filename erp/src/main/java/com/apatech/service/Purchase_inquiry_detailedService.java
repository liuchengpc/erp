package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_inquiry_detailed;
import com.apatech.domain.Purchase_inquiry_detailed;
import com.apatech.domain.Purchase_inquiry_detailed;
import com.apatech.mapper.Purchase_inquiry_detailedMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Purchase_inquiry_detailedService {
	@Autowired
	private Purchase_inquiry_detailedMapper dao;
	
	public PageInfo<Purchase_inquiry_detailed> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Purchase_inquiry_detailed> list=dao.selectAll();

    	PageInfo<Purchase_inquiry_detailed> page=new PageInfo<Purchase_inquiry_detailed>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String didId){
    	return dao.deleteByPrimaryKey(didId);
    }

    public int insert(Purchase_inquiry_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_inquiry_detailed record){
    	return dao.insertSelective(record);
    }

    public Purchase_inquiry_detailed selectByPrimaryKey(String didId){
    	return dao.selectByPrimaryKey(didId);
    }

    public int updateByPrimaryKeySelective(Purchase_inquiry_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_inquiry_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}