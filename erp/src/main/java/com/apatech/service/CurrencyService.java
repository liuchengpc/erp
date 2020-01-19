package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Currency;
import com.apatech.domain.Currency;
import com.apatech.mapper.CurrencyMapper;

@Service
@Transactional
public class CurrencyService {
	@Autowired
	private CurrencyMapper dao;
	
    public int deleteByPrimaryKey(String currencyId){
    	return dao.deleteByPrimaryKey(currencyId);
    }

    public int insert(Currency record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Currency record){
    	return dao.insertSelective(record);
    }

    public Currency selectByPrimaryKey(String currencyId){
    	return dao.selectByPrimaryKey(currencyId);
    }

    public int updateByPrimaryKeySelective(Currency record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Currency record){
    	return dao.updateByPrimaryKey(record);
    }
}