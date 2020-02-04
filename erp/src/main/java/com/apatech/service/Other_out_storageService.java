package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Other_out_storage;
import com.apatech.domain.Other_out_storage;
import com.apatech.domain.Other_out_storage;
import com.apatech.mapper.Other_out_storageMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Other_out_storageService {
	
	public PageInfo<Other_out_storage> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Other_out_storage> list=dao.selectAll();

    	PageInfo<Other_out_storage> page=new PageInfo<Other_out_storage>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
	@Autowired
	private Other_out_storageMapper dao;
	
    public int deleteByPrimaryKey(String oosId){
    	return dao.deleteByPrimaryKey(oosId);
    }

    public int insert(Other_out_storage record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Other_out_storage record){
    	return dao.insertSelective(record);
    }

    public Other_out_storage selectByPrimaryKey(String oosId){
    	return dao.selectByPrimaryKey(oosId);
    }

    public int updateByPrimaryKeySelective(Other_out_storage record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Other_out_storage record){
    	return dao.updateByPrimaryKey(record);
    }
}