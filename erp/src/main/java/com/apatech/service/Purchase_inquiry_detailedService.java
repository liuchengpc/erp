package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_inquiry_detailed;
import com.apatech.domain.Purchase_inquiry_detailed;
import com.apatech.mapper.Purchase_inquiry_detailedMapper;

@Service
@Transactional
public class Purchase_inquiry_detailedService {
	@Autowired
	private Purchase_inquiry_detailedMapper dao;
	
    public int deleteByPrimaryKey(String didId){
    	return dao.deleteByPrimaryKey(didId);
    }

    public int insert(Purchase_inquiry_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_inquiry_detailed record){
    	return dao.insertSelective(record);
    }

    public Purchase_inquiry_detailed selectByPrimaryKey(String didId){
    	return dao.selectByPrimaryKey(didId);
    }

    public int updateByPrimaryKeySelective(Purchase_inquiry_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_inquiry_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}