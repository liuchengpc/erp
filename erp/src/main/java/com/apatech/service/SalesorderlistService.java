package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Salesorderlist;
import com.apatech.domain.Salesorderlist;
import com.apatech.mapper.SalesorderlistMapper;

@Service
@Transactional
public class SalesorderlistService {
	@Autowired
	private SalesorderlistMapper dao;
	
    public int deleteByPrimaryKey(String solId){
    	return dao.deleteByPrimaryKey(solId);
    }

    public int insert(Salesorderlist record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Salesorderlist record){
    	return dao.insertSelective(record);
    }

    public Salesorderlist selectByPrimaryKey(String solId){
    	return dao.selectByPrimaryKey(solId);
    }

    public int updateByPrimaryKeySelective(Salesorderlist record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Salesorderlist record){
    	return dao.updateByPrimaryKey(record);
    }
}