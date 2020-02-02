package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.subject_blanket_category;
import com.apatech.domain.subject_blanket_category;
import com.apatech.domain.subject_blanket_category;
import com.apatech.mapper.subject_blanket_categoryMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class subject_blanket_categoryService {
	@Autowired
	private subject_blanket_categoryMapper dao;
	
	public PageInfo<subject_blanket_category> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<subject_blanket_category> list=dao.selectAll();

    	PageInfo<subject_blanket_category> page=new PageInfo<subject_blanket_category>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String sbcId){
    	return dao.deleteByPrimaryKey(sbcId);
    }

    public int insert(subject_blanket_category record){
    	return dao.insert(record);
    }
    
    public int insertSelective(subject_blanket_category record){
    	return dao.insertSelective(record);
    }

    public subject_blanket_category selectByPrimaryKey(String sbcId){
    	return dao.selectByPrimaryKey(sbcId);
    }

    public int updateByPrimaryKeySelective(subject_blanket_category record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(subject_blanket_category record){
    	return dao.updateByPrimaryKey(record);
    }
}