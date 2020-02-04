package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Other_input_storage;
import com.apatech.domain.Other_input_storage;
import com.apatech.domain.Other_input_storage;
import com.apatech.mapper.Other_input_storageMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Other_input_storageService {
	@Autowired
	private Other_input_storageMapper dao;
	
	public PageInfo<Other_input_storage> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Other_input_storage> list=dao.selectAll();

    	PageInfo<Other_input_storage> page=new PageInfo<Other_input_storage>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String oisId){
    	return dao.deleteByPrimaryKey(oisId);
    }

    public int insert(Other_input_storage record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Other_input_storage record){
    	return dao.insertSelective(record);
    }

    public Other_input_storage selectByPrimaryKey(String oisId){
    	return dao.selectByPrimaryKey(oisId);
    }

    public int updateByPrimaryKeySelective(Other_input_storage record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Other_input_storage record){
    	return dao.updateByPrimaryKey(record);
    }
}