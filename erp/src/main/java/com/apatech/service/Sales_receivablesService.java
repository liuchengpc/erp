package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_receivables;
import com.apatech.mapper.Sales_receivablesMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional
public class Sales_receivablesService {
	@Autowired
	private Sales_receivablesMapper dao;
	
	 public PageInfo<Sales_receivables> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Sales_receivables> list=dao.selectAll();

    	PageInfo<Sales_receivables> page=new PageInfo<Sales_receivables>(list);
//	    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
	
    public int deleteByPrimaryKey(Integer apId){
    	return dao.deleteByPrimaryKey(apId);    }

    public int insert(Sales_receivables record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_receivables record){
    	return dao.insertSelective(record);
    }

    public Sales_receivables selectByPrimaryKey(Integer apId){
    	return dao.selectByPrimaryKey(apId);
    }

    public int updateByPrimaryKeySelective(Sales_receivables record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_receivables record){
    	return dao.updateByPrimaryKey(record);
    }
}