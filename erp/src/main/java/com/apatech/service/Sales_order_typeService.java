package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_order_type;
import com.apatech.domain.Sales_order_type;
import com.apatech.mapper.Sales_order_typeMapper;

@Service
@Transactional
public class Sales_order_typeService {
	@Autowired
	private Sales_order_typeMapper dao;
	
    public int deleteByPrimaryKey(String sdId){
    	return dao.deleteByPrimaryKey(sdId);
    }

    public int insert(Sales_order_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_order_type record){
    	return dao.insertSelective(record);
    }

    public Sales_order_type selectByPrimaryKey(String sdId){
    	return dao.selectByPrimaryKey(sdId);
    }

    public int updateByPrimaryKeySelective(Sales_order_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_order_type record){
    	return dao.updateByPrimaryKey(record);
    }
}