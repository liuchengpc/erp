package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_inquiry;
import com.apatech.domain.Purchase_inquiry;
import com.apatech.mapper.Purchase_inquiryMapper;

@Service
@Transactional
public class Purchase_inquiryService {
	@Autowired
	private Purchase_inquiryMapper dao;
	
    public int deleteByPrimaryKey(String piId){
    	return dao.deleteByPrimaryKey(piId);
    }

    public int insert(Purchase_inquiry record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_inquiry record){
    	return dao.insertSelective(record);
    }

    public Purchase_inquiry selectByPrimaryKey(String piId){
    	return dao.selectByPrimaryKey(piId);
    }

    public int updateByPrimaryKeySelective(Purchase_inquiry record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_inquiry record){
    	return dao.updateByPrimaryKey(record);
    }
}