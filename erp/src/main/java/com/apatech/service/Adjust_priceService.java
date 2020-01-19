package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Adjust_price;
import com.apatech.mapper.Adjust_priceMapper;
@Service
@Transactional
public class Adjust_priceService {
	@Autowired
	private Adjust_priceMapper dao;
	
    public int deleteByPrimaryKey(String apId){
    	return dao.deleteByPrimaryKey(apId);    }

    public int insert(Adjust_price record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Adjust_price record){
    	return dao.insertSelective(record);
    }

    public Adjust_price selectByPrimaryKey(String apId){
    	return dao.selectByPrimaryKey(apId);
    }

    public int updateByPrimaryKeySelective(Adjust_price record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Adjust_price record){
    	return dao.updateByPrimaryKey(record);
    }
}