package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Bank;
import com.apatech.domain.Bank;
import com.apatech.mapper.BankMapper;

@Service
@Transactional
public class BankService {
	@Autowired
	private BankMapper dao;
	
    public int deleteByPrimaryKey(String bankId){
    	return dao.deleteByPrimaryKey(bankId);
    }

    public int insert(Bank record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Bank record){
    	return dao.insertSelective(record);
    }

    public Bank selectByPrimaryKey(String bankId){
    	return dao.selectByPrimaryKey(bankId);
    }

    public int updateByPrimaryKeySelective(Bank record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Bank record){
    	return dao.updateByPrimaryKey(record);
    }
}