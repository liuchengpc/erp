package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Potential_customer;
import com.apatech.domain.Potential_customer;
import com.apatech.mapper.Potential_customerMapper;

@Service
@Transactional
public class Potential_customerService {
	@Autowired
	private Potential_customerMapper dao;
	
    public int deleteByPrimaryKey(String pcId){
    	return dao.deleteByPrimaryKey(pcId);
    }

    public int insert(Potential_customer record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Potential_customer record){
    	return dao.insertSelective(record);
    }

    public Potential_customer selectByPrimaryKey(String pcId){
    	return dao.selectByPrimaryKey(pcId);
    }

    public int updateByPrimaryKeySelective(Potential_customer record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Potential_customer record){
    	return dao.updateByPrimaryKey(record);
    }
}