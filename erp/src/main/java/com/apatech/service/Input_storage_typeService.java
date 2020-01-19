package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Input_storage_type;
import com.apatech.domain.Input_storage_type;
import com.apatech.mapper.Input_storage_typeMapper;

@Service
@Transactional
public class Input_storage_typeService {
	@Autowired
	private Input_storage_typeMapper dao;
	
    public int deleteByPrimaryKey(String istId){
    	return dao.deleteByPrimaryKey(istId);
    }

    public int insert(Input_storage_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Input_storage_type record){
    	return dao.insertSelective(record);
    }

    public Input_storage_type selectByPrimaryKey(String istId){
    	return dao.selectByPrimaryKey(istId);
    }

    public int updateByPrimaryKeySelective(Input_storage_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Input_storage_type record){
    	return dao.updateByPrimaryKey(record);
    }
}