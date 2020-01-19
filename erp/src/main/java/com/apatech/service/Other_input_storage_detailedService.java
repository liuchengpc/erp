package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Other_input_storage_detailed;
import com.apatech.domain.Other_input_storage_detailed;
import com.apatech.mapper.Other_input_storage_detailedMapper;

@Service
@Transactional
public class Other_input_storage_detailedService {
	@Autowired
	private Other_input_storage_detailedMapper dao;
	
    public int deleteByPrimaryKey(String oisdId){
    	return dao.deleteByPrimaryKey(oisdId);
    }

    public int insert(Other_input_storage_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Other_input_storage_detailed record){
    	return dao.insertSelective(record);
    }

    public Other_input_storage_detailed selectByPrimaryKey(String oisdId){
    	return dao.selectByPrimaryKey(oisdId);
    }

    public int updateByPrimaryKeySelective(Other_input_storage_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Other_input_storage_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}