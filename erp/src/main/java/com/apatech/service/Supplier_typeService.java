package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Supplier_type;
import com.apatech.domain.Supplier_type;
import com.apatech.mapper.Supplier_typeMapper;

@Service
@Transactional
public class Supplier_typeService {
	@Autowired
	private Supplier_typeMapper dao;
	
    public int deleteByPrimaryKey(String stId){
    	return dao.deleteByPrimaryKey(stId);
    }

    public int insert(Supplier_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Supplier_type record){
    	return dao.insertSelective(record);
    }

    public Supplier_type selectByPrimaryKey(String stId){
    	return dao.selectByPrimaryKey(stId);
    }

    public int updateByPrimaryKeySelective(Supplier_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Supplier_type record){
    	return dao.updateByPrimaryKey(record);
    }
}