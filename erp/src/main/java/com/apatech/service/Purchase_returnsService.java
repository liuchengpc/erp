package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_returns;
import com.apatech.domain.Purchase_returns;
import com.apatech.mapper.Purchase_returnsMapper;

@Service
@Transactional
public class Purchase_returnsService {
	@Autowired
	private Purchase_returnsMapper dao;
	
    public int deleteByPrimaryKey(String pureId){
    	return dao.deleteByPrimaryKey(pureId);
    }

    public int insert(Purchase_returns record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_returns record){
    	return dao.insertSelective(record);
    }

    public Purchase_returns selectByPrimaryKey(String pureId){
    	return dao.selectByPrimaryKey(pureId);
    }

    public int updateByPrimaryKeySelective(Purchase_returns record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_returns record){
    	return dao.updateByPrimaryKey(record);
    }
}