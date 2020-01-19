package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Other_input_storage;
import com.apatech.domain.Other_input_storage;
import com.apatech.mapper.Other_input_storageMapper;

@Service
@Transactional
public class Other_input_storageService {
	@Autowired
	private Other_input_storageMapper dao;
	
    public int deleteByPrimaryKey(String oisId){
    	return dao.deleteByPrimaryKey(oisId);
    }

    public int insert(Other_input_storage record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Other_input_storage record){
    	return dao.insertSelective(record);
    }

    public Other_input_storage selectByPrimaryKey(String oisId){
    	return dao.selectByPrimaryKey(oisId);
    }

    public int updateByPrimaryKeySelective(Other_input_storage record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Other_input_storage record){
    	return dao.updateByPrimaryKey(record);
    }
}