package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Income_costs_type;
import com.apatech.domain.Income_costs_type;
import com.apatech.mapper.Income_costs_typeMapper;

@Service
@Transactional
public class Income_costs_typeService {
	@Autowired
	private Income_costs_typeMapper dao;
	
    public int deleteByPrimaryKey(String ictId){
    	return dao.deleteByPrimaryKey(ictId);
    }

    public int insert(Income_costs_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Income_costs_type record){
    	return dao.insertSelective(record);
    }

    public Income_costs_type selectByPrimaryKey(String Income_costs_typeId){
    	return dao.selectByPrimaryKey(Income_costs_typeId);
    }

    public int updateByPrimaryKeySelective(Income_costs_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Income_costs_type record){
    	return dao.updateByPrimaryKey(record);
    }
}