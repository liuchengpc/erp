package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Out_storage_type;
import com.apatech.domain.Out_storage_type;
import com.apatech.mapper.Out_storage_typeMapper;

@Service
@Transactional
public class Out_storage_typeService {
	@Autowired
	private Out_storage_typeMapper dao;
	
    public int deleteByPrimaryKey(String ostId){
    	return dao.deleteByPrimaryKey(ostId);
    }

    public int insert(Out_storage_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Out_storage_type record){
    	return dao.insertSelective(record);
    }

    public Out_storage_type selectByPrimaryKey(String ostId){
    	return dao.selectByPrimaryKey(ostId);
    }

    public int updateByPrimaryKeySelective(Out_storage_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Out_storage_type record){
    	return dao.updateByPrimaryKey(record);
    }
}