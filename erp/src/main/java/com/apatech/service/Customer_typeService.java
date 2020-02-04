package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Customer_type;
import com.apatech.domain.Customer_type;
import com.apatech.domain.Customer_type;
import com.apatech.mapper.Customer_typeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Customer_typeService {
	@Autowired
	private Customer_typeMapper dao;
	
	public PageInfo<Customer_type> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Customer_type> list=dao.selectAll();

    	PageInfo<Customer_type> page=new PageInfo<Customer_type>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String cutyId){
    	return dao.deleteByPrimaryKey(cutyId);
    }

    public int insert(Customer_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Customer_type record){
    	return dao.insertSelective(record);
    }

    public Customer_type selectByPrimaryKey(String cutyId){
    	return dao.selectByPrimaryKey(cutyId);
    }

    public int updateByPrimaryKeySelective(Customer_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Customer_type record){
    	return dao.updateByPrimaryKey(record);
    }
}