package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Other_out_storage;
import com.apatech.domain.Other_out_storage;
import com.apatech.mapper.Other_out_storageMapper;

@Service
@Transactional
public class Other_out_storageService {
	@Autowired
	private Other_out_storageMapper dao;
	
    public int deleteByPrimaryKey(String oosId){
    	return dao.deleteByPrimaryKey(oosId);
    }

    public int insert(Other_out_storage record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Other_out_storage record){
    	return dao.insertSelective(record);
    }

    public Other_out_storage selectByPrimaryKey(String oosId){
    	return dao.selectByPrimaryKey(oosId);
    }

    public int updateByPrimaryKeySelective(Other_out_storage record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Other_out_storage record){
    	return dao.updateByPrimaryKey(record);
    }
}