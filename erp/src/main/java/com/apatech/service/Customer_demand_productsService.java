package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Customer_demand_products;
import com.apatech.domain.Customer_demand_products;
import com.apatech.domain.Customer_demand_products;
import com.apatech.mapper.Customer_demand_productsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Customer_demand_productsService {
	@Autowired
	private Customer_demand_productsMapper dao;
	
	public PageInfo<Customer_demand_products> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Customer_demand_products> list=dao.selectAll();

    	PageInfo<Customer_demand_products> page=new PageInfo<Customer_demand_products>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String cdpId){
    	return dao.deleteByPrimaryKey(cdpId);
    }

    public int insert(Customer_demand_products record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Customer_demand_products record){
    	return dao.insertSelective(record);
    }

    public Customer_demand_products selectByPrimaryKey(String cdpId){
    	return dao.selectByPrimaryKey(cdpId);
    }

    public int updateByPrimaryKeySelective(Customer_demand_products record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Customer_demand_products record){
    	return dao.updateByPrimaryKey(record);
    }
}