package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Check;
import com.apatech.domain.Check;
import com.apatech.mapper.CheckMapper;

@Service
@Transactional
public class CheckService {
	@Autowired
	private CheckMapper dao;
	
    public int deleteByPrimaryKey(String checkId){
    	return dao.deleteByPrimaryKey(checkId);
    }

    public int insert(Check record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Check record){
    	return dao.insertSelective(record);
    }

    public Check selectByPrimaryKey(String checkId){
    	return dao.selectByPrimaryKey(checkId);
    }

    public int updateByPrimaryKeySelective(Check record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Check record){
    	return dao.updateByPrimaryKey(record);
    }
}