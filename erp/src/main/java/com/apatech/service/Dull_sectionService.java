package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Dull_section;
import com.apatech.domain.Dull_section;
import com.apatech.domain.Dull_section;
import com.apatech.mapper.Dull_sectionMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Dull_sectionService {
	@Autowired
	private Dull_sectionMapper dao;
	
	public PageInfo<Dull_section> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Dull_section> list=dao.selectAll();

    	PageInfo<Dull_section> page=new PageInfo<Dull_section>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String dsId){
    	return dao.deleteByPrimaryKey(dsId);
    }

    public int insert(Dull_section record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Dull_section record){
    	return dao.insertSelective(record);
    }

    public Dull_section selectByPrimaryKey(String dsId){
    	return dao.selectByPrimaryKey(dsId);
    }

    public int updateByPrimaryKeySelective(Dull_section record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Dull_section record){
    	return dao.updateByPrimaryKey(record);
    }
}