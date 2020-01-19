package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchasing_order_type;
import com.apatech.domain.Purchasing_order_type;
import com.apatech.mapper.Purchasing_order_typeMapper;

@Service
@Transactional
public class Purchasing_order_typeService {
	@Autowired
	private Purchasing_order_typeMapper dao;
	
    public int deleteByPrimaryKey(String potId){
    	return dao.deleteByPrimaryKey(potId);
    }

    public int insert(Purchasing_order_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchasing_order_type record){
    	return dao.insertSelective(record);
    }

    public Purchasing_order_type selectByPrimaryKey(String potId){
    	return dao.selectByPrimaryKey(potId);
    }

    public int updateByPrimaryKeySelective(Purchasing_order_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchasing_order_type record){
    	return dao.updateByPrimaryKey(record);
    }
}