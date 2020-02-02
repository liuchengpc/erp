package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Educational_background;
import com.apatech.domain.Educational_background;
import com.apatech.domain.Educational_background;
import com.apatech.mapper.Educational_backgroundMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Educational_backgroundService {
	@Autowired
	private Educational_backgroundMapper dao;
	
	public PageInfo<Educational_background> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Educational_background> list=dao.selectAll();

    	PageInfo<Educational_background> page=new PageInfo<Educational_background>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String ebId){
    	return dao.deleteByPrimaryKey(ebId);
    }

    public int insert(Educational_background record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Educational_background record){
    	return dao.insertSelective(record);
    }

    public Educational_background selectByPrimaryKey(String ebId){
    	return dao.selectByPrimaryKey(ebId);
    }

    public int updateByPrimaryKeySelective(Educational_background record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Educational_background record){
    	return dao.updateByPrimaryKey(record);
    }
}