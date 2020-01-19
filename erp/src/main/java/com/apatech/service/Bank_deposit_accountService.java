package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Account;
import com.apatech.domain.Bank_deposit_account;
import com.apatech.mapper.Bank_deposit_accountMapper;

@Service
@Transactional
public class Bank_deposit_accountService {
	@Autowired
	private Bank_deposit_accountMapper dao;
	
    public int deleteByPrimaryKey(String adaId){
    	return dao.deleteByPrimaryKey(adaId);
    }

    public int insert(Bank_deposit_account record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Bank_deposit_account record){
    	return dao.insertSelective(record);
    }

    public Bank_deposit_account selectByPrimaryKey(String adaId){
    	return dao.selectByPrimaryKey(adaId);
    }

    public int updateByPrimaryKeySelective(Bank_deposit_account record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Bank_deposit_account record){
    	return dao.updateByPrimaryKey(record);
    }
}