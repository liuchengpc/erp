package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Other_out_storage_detailed;
import com.apatech.domain.Other_out_storage_detailed;
import com.apatech.mapper.Other_out_storage_detailedMapper;

@Service
@Transactional
public class Other_out_storage_detailedService {
	@Autowired
	private Other_out_storage_detailedMapper dao;
	
    public int deleteByPrimaryKey(String oosdId){
    	return dao.deleteByPrimaryKey(oosdId);
    }

    public int insert(Other_out_storage_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Other_out_storage_detailed record){
    	return dao.insertSelective(record);
    }

    public Other_out_storage_detailed selectByPrimaryKey(String oosdId){
    	return dao.selectByPrimaryKey(oosdId);
    }

    public int updateByPrimaryKeySelective(Other_out_storage_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Other_out_storage_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}