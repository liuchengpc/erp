package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Customer_grade;
import com.apatech.domain.Customer_grade;
import com.apatech.domain.Customer_grade;
import com.apatech.mapper.Customer_gradeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Customer_gradeService {
	@Autowired
	private Customer_gradeMapper dao;
	
	public PageInfo<Customer_grade> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Customer_grade> list=dao.selectAll();

    	PageInfo<Customer_grade> page=new PageInfo<Customer_grade>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String cgId){
    	return dao.deleteByPrimaryKey(cgId);
    }

    public int insert(Customer_grade record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Customer_grade record){
    	return dao.insertSelective(record);
    }

    public Customer_grade selectByPrimaryKey(String cgId){
    	return dao.selectByPrimaryKey(cgId);
    }

    public int updateByPrimaryKeySelective(Customer_grade record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Customer_grade record){
    	return dao.updateByPrimaryKey(record);
    }
}