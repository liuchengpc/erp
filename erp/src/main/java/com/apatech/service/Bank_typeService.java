package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Bank_type;
import com.apatech.domain.Bank_type;
import com.apatech.mapper.Bank_typeMapper;

@Service
@Transactional
public class Bank_typeService {
	@Autowired
	private Bank_typeMapper dao;
	
    public int deleteByPrimaryKey(String btId){
    	return dao.deleteByPrimaryKey(btId);
    }

    public int insert(Bank_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Bank_type record){
    	return dao.insertSelective(record);
    }

    public Bank_type selectByPrimaryKey(String btId){
    	return dao.selectByPrimaryKey(btId);
    }

    public int updateByPrimaryKeySelective(Bank_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Bank_type record){
    	return dao.updateByPrimaryKey(record);
    }
}