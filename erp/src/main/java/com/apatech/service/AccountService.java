package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Account;
import com.apatech.mapper.AccountMapper;
@Service
@Transactional
public class AccountService {
	@Autowired
	private AccountMapper dao;
	
    public int deleteByPrimaryKey(String accountId){
    	return dao.deleteByPrimaryKey(accountId);
    }

    public int insert(Account record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Account record){
    	return dao.insertSelective(record);
    }

    public Account selectByPrimaryKey(String accountId){
    	return dao.selectByPrimaryKey(accountId);
    }

    public int updateByPrimaryKeySelective(Account record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Account record){
    	return dao.updateByPrimaryKey(record);
    }
}