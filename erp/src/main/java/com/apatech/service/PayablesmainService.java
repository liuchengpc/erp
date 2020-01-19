package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Payablesmain;
import com.apatech.domain.Payablesmain;
import com.apatech.mapper.PayablesmainMapper;

@Service
@Transactional
public class PayablesmainService {
	@Autowired
	private PayablesmainMapper dao;
	
    public int deleteByPrimaryKey(String payablesmainId){
    	return dao.deleteByPrimaryKey(payablesmainId);
    }

    public int insert(Payablesmain record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Payablesmain record){
    	return dao.insertSelective(record);
    }

    public Payablesmain selectByPrimaryKey(String payablesmainId){
    	return dao.selectByPrimaryKey(payablesmainId);
    }

    public int updateByPrimaryKeySelective(Payablesmain record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Payablesmain record){
    	return dao.updateByPrimaryKey(record);
    }
}