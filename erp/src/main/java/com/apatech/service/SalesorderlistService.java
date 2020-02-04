package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Salesorderlist;
import com.apatech.domain.Salesorderlist;
import com.apatech.domain.Salesorderlist;
import com.apatech.mapper.SalesorderlistMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SalesorderlistService {
	@Autowired
	private SalesorderlistMapper dao;
	
	public PageInfo<Salesorderlist> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Salesorderlist> list=dao.selectAll();

    	PageInfo<Salesorderlist> page=new PageInfo<Salesorderlist>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String solId){
    	return dao.deleteByPrimaryKey(solId);
    }

    public int insert(Salesorderlist record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Salesorderlist record){
    	return dao.insertSelective(record);
    }

    public Salesorderlist selectByPrimaryKey(String solId){
    	return dao.selectByPrimaryKey(solId);
    }

    public int updateByPrimaryKeySelective(Salesorderlist record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Salesorderlist record){
    	return dao.updateByPrimaryKey(record);
    }
}