package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Check_detailed;
import com.apatech.domain.Check_detailed;
import com.apatech.mapper.Check_detailedMapper;

@Service
@Transactional
public class Check_detailedService {
	@Autowired
	private Check_detailedMapper dao;
	
    public int deleteByPrimaryKey(String cdId){
    	return dao.deleteByPrimaryKey(cdId);
    }

    public int insert(Check_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Check_detailed record){
    	return dao.insertSelective(record);
    }

    public Check_detailed selectByPrimaryKey(String cdId){
    	return dao.selectByPrimaryKey(cdId);
    }

    public int updateByPrimaryKeySelective(Check_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Check_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}