package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Customer;
import com.apatech.domain.Customer;
import com.apatech.mapper.CustomerMapper;

@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerMapper dao;
	
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