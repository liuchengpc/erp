package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Receivable;
import com.apatech.domain.Receivable;
import com.apatech.mapper.ReceivableMapper;

@Service
@Transactional
public class ReceivableService {
	@Autowired
	private ReceivableMapper dao;
	
    public int deleteByPrimaryKey(String receivableId){
    	return dao.deleteByPrimaryKey(receivableId);
    }

    public int insert(Receivable record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Receivable record){
    	return dao.insertSelective(record);
    }

    public Receivable selectByPrimaryKey(String receivableId){
    	return dao.selectByPrimaryKey(receivableId);
    }

    public int updateByPrimaryKeySelective(Receivable record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Receivable record){
    	return dao.updateByPrimaryKey(record);
    }
}