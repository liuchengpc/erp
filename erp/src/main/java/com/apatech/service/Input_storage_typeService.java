package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Input_storage_type;
import com.apatech.domain.Input_storage_type;
import com.apatech.domain.Input_storage_type;
import com.apatech.mapper.Input_storage_typeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Input_storage_typeService {
	@Autowired
	private Input_storage_typeMapper dao;
	
	public PageInfo<Input_storage_type> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Input_storage_type> list=dao.selectAll();

    	PageInfo<Input_storage_type> page=new PageInfo<Input_storage_type>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String istId){
    	return dao.deleteByPrimaryKey(istId);
    }

    public int insert(Input_storage_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Input_storage_type record){
    	return dao.insertSelective(record);
    }

    public Input_storage_type selectByPrimaryKey(String istId){
    	return dao.selectByPrimaryKey(istId);
    }

    public int updateByPrimaryKeySelective(Input_storage_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Input_storage_type record){
    	return dao.updateByPrimaryKey(record);
    }
}