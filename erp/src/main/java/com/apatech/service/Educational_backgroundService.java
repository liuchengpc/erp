package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Educational_background;
import com.apatech.domain.Educational_background;
import com.apatech.mapper.Educational_backgroundMapper;

@Service
@Transactional
public class Educational_backgroundService {
	@Autowired
	private Educational_backgroundMapper dao;
	
    public int deleteByPrimaryKey(String ebId){
    	return dao.deleteByPrimaryKey(ebId);
    }

    public int insert(Educational_background record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Educational_background record){
    	return dao.insertSelective(record);
    }

    public Educational_background selectByPrimaryKey(String ebId){
    	return dao.selectByPrimaryKey(ebId);
    }

    public int updateByPrimaryKeySelective(Educational_background record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Educational_background record){
    	return dao.updateByPrimaryKey(record);
    }
}