package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Measurement_unit;
import com.apatech.domain.Measurement_unit;
import com.apatech.mapper.Measurement_unitMapper;

@Service
@Transactional
public class Measurement_unitService {
	@Autowired
	private Measurement_unitMapper dao;
	
    public int deleteByPrimaryKey(String muId){
    	return dao.deleteByPrimaryKey(muId);
    }

    public int insert(Measurement_unit record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Measurement_unit record){
    	return dao.insertSelective(record);
    }

    public Measurement_unit selectByPrimaryKey(String muId){
    	return dao.selectByPrimaryKey(muId);
    }

    public int updateByPrimaryKeySelective(Measurement_unit record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Measurement_unit record){
    	return dao.updateByPrimaryKey(record);
    }
}