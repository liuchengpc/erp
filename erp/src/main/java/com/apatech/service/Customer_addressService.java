package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Customer_address;
import com.apatech.domain.Customer_address;
import com.apatech.mapper.Customer_addressMapper;

@Service
@Transactional
public class Customer_addressService {
	@Autowired
	private Customer_addressMapper dao;
	
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