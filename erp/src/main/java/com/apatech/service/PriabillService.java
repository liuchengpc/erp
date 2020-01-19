package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Priabill;
import com.apatech.mapper.PriabillMapper;

@Service
@Transactional
public class PriabillService {
	@Autowired
	private PriabillMapper dao;
	
    public int deleteByPrimaryKey(String priabillId){
    	return dao.deleteByPrimaryKey(priabillId);
    }

    public int insert(Priabill record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Priabill record){
    	return dao.insertSelective(record);
    }

    public Priabill selectByPrimaryKey(String priabillId){
    	return dao.selectByPrimaryKey(priabillId);
    }

    public int updateByPrimaryKeySelective(Priabill record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Priabill record){
    	return dao.updateByPrimaryKey(record);
    }
}