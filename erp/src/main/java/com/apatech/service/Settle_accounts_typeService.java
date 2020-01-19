package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Settle_accounts_type;
import com.apatech.mapper.Settle_accounts_typeMapper;

@Service
@Transactional
public class Settle_accounts_typeService {
	@Autowired
	private Settle_accounts_typeMapper dao;
	
    public int deleteByPrimaryKey(String satId){
    	return dao.deleteByPrimaryKey(satId);
    }

    public int insert(Settle_accounts_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Settle_accounts_type record){
    	return dao.insertSelective(record);
    }

    public Settle_accounts_type selectByPrimaryKey(String satId){
    	return dao.selectByPrimaryKey(satId);
    }

    public int updateByPrimaryKeySelective(Settle_accounts_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Settle_accounts_type record){
    	return dao.updateByPrimaryKey(record);
    }
}