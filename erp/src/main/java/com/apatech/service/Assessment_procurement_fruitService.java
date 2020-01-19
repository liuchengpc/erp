package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Assessment_procurement_fruit;
import com.apatech.mapper.Assessment_procurement_fruitMapper;

@Service
@Transactional
public class Assessment_procurement_fruitService {
	@Autowired
	private Assessment_procurement_fruitMapper dao;
	
    public int deleteByPrimaryKey(String apfId){
    	return dao.deleteByPrimaryKey(apfId);
    }

    public int insert(Assessment_procurement_fruit record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Assessment_procurement_fruit record){
    	return dao.insertSelective(record);
    }

    public Assessment_procurement_fruit selectByPrimaryKey(String apfId){
    	return dao.selectByPrimaryKey(apfId);
    }

    public int updateByPrimaryKeySelective(Assessment_procurement_fruit record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Assessment_procurement_fruit record){
    	return dao.updateByPrimaryKey(record);
    }
}