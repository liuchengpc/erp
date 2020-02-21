package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Adjust_detail;
import com.apatech.mapper.Adjust_detailMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional
public class Adjust_detailService {
	@Autowired
	private Adjust_detailMapper dao;
	
	 public PageInfo<Adjust_detail> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Adjust_detail> list=dao.selectAll();

    	PageInfo<Adjust_detail> page=new PageInfo<Adjust_detail>(list);
//	    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(Integer apId){
    	return dao.deleteByPrimaryKey(apId);    }

    public int insert(Adjust_detail record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Adjust_detail record){
    	return dao.insertSelective(record);
    }

    public Adjust_detail selectByPrimaryKey(Integer apId){
    	return dao.selectByPrimaryKey(apId);
    }

    public int updateByPrimaryKeySelective(Adjust_detail record){
    	return dao.updateByPrimaryKeySelective(record);
    }
  
    public int updateByPrimaryKey(Adjust_detail record){
    	return dao.updateByPrimaryKey(record);
    }
}