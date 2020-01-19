package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Customer_demand_products;
import com.apatech.domain.Customer_demand_products;
import com.apatech.mapper.Customer_demand_productsMapper;

@Service
@Transactional
public class Customer_demand_productsService {
	@Autowired
	private Customer_demand_productsMapper dao;
	
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