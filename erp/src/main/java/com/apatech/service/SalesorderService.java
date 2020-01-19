package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Salesorder;
import com.apatech.domain.Salesorder;
import com.apatech.mapper.SalesorderMapper;

@Service
@Transactional
public class SalesorderService {
	@Autowired
	private SalesorderMapper dao;
	
    public int deleteByPrimaryKey(String soId){
    	return dao.deleteByPrimaryKey(soId);
    }

    public int insert(Salesorder record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Salesorder record){
    	return dao.insertSelective(record);
    }

    public Salesorder selectByPrimaryKey(String soId){
    	return dao.selectByPrimaryKey(soId);
    }

    public int updateByPrimaryKeySelective(Salesorder record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Salesorder record){
    	return dao.updateByPrimaryKey(record);
    }
}