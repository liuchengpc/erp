package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_returns_detailed;
import com.apatech.domain.Purchase_returns_detailed;
import com.apatech.mapper.Purchase_returns_detailedMapper;

@Service
@Transactional
public class Purchase_returns_detailedService {
	@Autowired
	private Purchase_returns_detailedMapper dao;
	
    public int deleteByPrimaryKey(String puredId){
    	return dao.deleteByPrimaryKey(puredId);
    }

    public int insert(Purchase_returns_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_returns_detailed record){
    	return dao.insertSelective(record);
    }

    public Purchase_returns_detailed selectByPrimaryKey(String puredId){
    	return dao.selectByPrimaryKey(puredId);
    }

    public int updateByPrimaryKeySelective(Purchase_returns_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_returns_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}