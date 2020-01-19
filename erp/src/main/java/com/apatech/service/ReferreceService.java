package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Referrece;
import com.apatech.domain.Referrece;
import com.apatech.mapper.ReferreceMapper;

@Service
@Transactional
public class ReferreceService {
	@Autowired
	private ReferreceMapper dao;
	
    public int deleteByPrimaryKey(String referreceId){
    	return dao.deleteByPrimaryKey(referreceId);
    }

    public int insert(Referrece record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Referrece record){
    	return dao.insertSelective(record);
    }

    public Referrece selectByPrimaryKey(String referreceId){
    	return dao.selectByPrimaryKey(referreceId);
    }

    public int updateByPrimaryKeySelective(Referrece record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Referrece record){
    	return dao.updateByPrimaryKey(record);
    }
}