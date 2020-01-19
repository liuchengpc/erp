package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Customer_type;
import com.apatech.domain.Customer_type;
import com.apatech.mapper.Customer_typeMapper;

@Service
@Transactional
public class Customer_typeService {
	@Autowired
	private Customer_typeMapper dao;
	
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