package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Other_input_storage_detailed;
import com.apatech.domain.Other_input_storage_detailed;
import com.apatech.domain.Other_input_storage_detailed;
import com.apatech.mapper.Other_input_storage_detailedMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Other_input_storage_detailedService {
	@Autowired
	private Other_input_storage_detailedMapper dao;
	
	public PageInfo<Other_input_storage_detailed> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Other_input_storage_detailed> list=dao.selectAll();

    	PageInfo<Other_input_storage_detailed> page=new PageInfo<Other_input_storage_detailed>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String oisdId){
    	return dao.deleteByPrimaryKey(oisdId);
    }

    public int insert(Other_input_storage_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Other_input_storage_detailed record){
    	return dao.insertSelective(record);
    }

    public Other_input_storage_detailed selectByPrimaryKey(String oisdId){
    	return dao.selectByPrimaryKey(oisdId);
    }

    public int updateByPrimaryKeySelective(Other_input_storage_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Other_input_storage_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}