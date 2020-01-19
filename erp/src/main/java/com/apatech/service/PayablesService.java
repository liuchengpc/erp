package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Payables;
import com.apatech.domain.Payables;
import com.apatech.mapper.PayablesMapper;

@Service
@Transactional
public class PayablesService {
	@Autowired
	private PayablesMapper dao;
	
    public int deleteByPrimaryKey(String payablesId){
    	return dao.deleteByPrimaryKey(payablesId);
    }

    public int insert(Payables record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Payables record){
    	return dao.insertSelective(record);
    }

    public Payables selectByPrimaryKey(String payablesId){
    	return dao.selectByPrimaryKey(payablesId);
    }

    public int updateByPrimaryKeySelective(Payables record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Payables record){
    	return dao.updateByPrimaryKey(record);
    }
}