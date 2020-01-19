package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Assessment_procurement_detailed;
import com.apatech.domain.Assessment_procurement_detailed;
import com.apatech.mapper.Assessment_procurement_detailedMapper;
@Service
@Transactional
public class Assessment_procurement_detailedService {
	@Autowired
	private Assessment_procurement_detailedMapper dao;
	
    public int deleteByPrimaryKey(String apdId){
    	return dao.deleteByPrimaryKey(apdId);
    }

    public int insert(Assessment_procurement_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Assessment_procurement_detailed record){
    	return dao.insertSelective(record);
    }

    public Assessment_procurement_detailed selectByPrimaryKey(String apdId){
    	return dao.selectByPrimaryKey(apdId);
    }

    public int updateByPrimaryKeySelective(Assessment_procurement_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Assessment_procurement_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}