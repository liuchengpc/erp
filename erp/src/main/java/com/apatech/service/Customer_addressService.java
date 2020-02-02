package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Customer_address;
import com.apatech.domain.Customer_address;
import com.apatech.domain.Customer_address;
import com.apatech.mapper.Customer_addressMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Customer_addressService {
	@Autowired
	private Customer_addressMapper dao;
	
	public PageInfo<Customer_address> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Customer_address> list=dao.selectAll();

    	PageInfo<Customer_address> page=new PageInfo<Customer_address>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String caAddressid){
    	return dao.deleteByPrimaryKey(caAddressid);
    }

    public int insert(Customer_address record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Customer_address record){
    	return dao.insertSelective(record);
    }

    public Customer_address selectByPrimaryKey(String caAddressid){
    	return dao.selectByPrimaryKey(caAddressid);
    }

    public int updateByPrimaryKeySelective(Customer_address record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Customer_address record){
    	return dao.updateByPrimaryKey(record);
    }
}