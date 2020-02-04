package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Customer;
import com.apatech.domain.Customer;
import com.apatech.domain.Customer;
import com.apatech.mapper.CustomerMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerMapper dao;
	
	public PageInfo<Customer> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Customer> list=dao.selectAll();

    	PageInfo<Customer> page=new PageInfo<Customer>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String customerId){
    	return dao.deleteByPrimaryKey(customerId);
    }

    public int insert(Customer record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Customer record){
    	return dao.insertSelective(record);
    }

    public Customer selectByPrimaryKey(String customerId){
    	return dao.selectByPrimaryKey(customerId);
    }

    public int updateByPrimaryKeySelective(Customer record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Customer record){
    	return dao.updateByPrimaryKey(record);
    }
}