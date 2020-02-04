package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Subject_category;
import com.apatech.domain.Subject_category;
import com.apatech.domain.Subject_category;
import com.apatech.mapper.Subject_categoryMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Subject_categoryService {
	@Autowired
	private Subject_categoryMapper dao;
	
	public PageInfo<Subject_category> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Subject_category> list=dao.selectAll();

    	PageInfo<Subject_category> page=new PageInfo<Subject_category>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String scId){
    	return dao.deleteByPrimaryKey(scId);
    }

    public int insert(Subject_category record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Subject_category record){
    	return dao.insertSelective(record);
    }

    public Subject_category selectByPrimaryKey(String scId){
    	return dao.selectByPrimaryKey(scId);
    }

    public int updateByPrimaryKeySelective(Subject_category record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Subject_category record){
    	return dao.updateByPrimaryKey(record);
    }
}