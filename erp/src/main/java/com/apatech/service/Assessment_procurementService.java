package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Assessment_procurement;
import com.apatech.mapper.Assessment_procurementMapper;

@Service
@Transactional
public class Assessment_procurementService {
	@Autowired
	private Assessment_procurementMapper dao;
	
    public int deleteByPrimaryKey(String apId){
    	return dao.deleteByPrimaryKey(apId);
    }

    public int insert(Assessment_procurement record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Assessment_procurement record){
    	return dao.insertSelective(record);
    }

    public Assessment_procurement selectByPrimaryKey(String apId){
    	return dao.selectByPrimaryKey(apId);
    }

    public int updateByPrimaryKeySelective(Assessment_procurement record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Assessment_procurement record){
    	return dao.updateByPrimaryKey(record);
    }
}