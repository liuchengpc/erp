package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Invoice_type;
import com.apatech.domain.Invoice_type;
import com.apatech.mapper.Invoice_typeMapper;

@Service
@Transactional
public class Invoice_typeService {
	@Autowired
	private Invoice_typeMapper dao;
	
    public int deleteByPrimaryKey(String itId){
    	return dao.deleteByPrimaryKey(itId);
    }

    public int insert(Invoice_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Invoice_type record){
    	return dao.insertSelective(record);
    }

    public Invoice_type selectByPrimaryKey(String itId){
    	return dao.selectByPrimaryKey(itId);
    }

    public int updateByPrimaryKeySelective(Invoice_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Invoice_type record){
    	return dao.updateByPrimaryKey(record);
    }
}