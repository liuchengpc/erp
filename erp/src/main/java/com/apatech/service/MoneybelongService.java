package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Moneybelong;
import com.apatech.domain.Moneybelong;
import com.apatech.mapper.MoneybelongMapper;

@Service
@Transactional
public class MoneybelongService {
	@Autowired
	private MoneybelongMapper dao;
	
    public int deleteByPrimaryKey(String moneybelongId){
    	return dao.deleteByPrimaryKey(moneybelongId);
    }

    public int insert(Moneybelong record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Moneybelong record){
    	return dao.insertSelective(record);
    }

    public Moneybelong selectByPrimaryKey(String moneybelongId){
    	return dao.selectByPrimaryKey(moneybelongId);
    }

    public int updateByPrimaryKeySelective(Moneybelong record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Moneybelong record){
    	return dao.updateByPrimaryKey(record);
    }
}