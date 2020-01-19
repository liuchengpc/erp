package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Requisition_detailed;
import com.apatech.domain.Requisition_detailed;
import com.apatech.mapper.Requisition_detailedMapper;

@Service
@Transactional
public class Requisition_detailedService {
	@Autowired
	private Requisition_detailedMapper dao;
	
    public int deleteByPrimaryKey(String rdId){
    	return dao.deleteByPrimaryKey(rdId);
    }

    public int insert(Requisition_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Requisition_detailed record){
    	return dao.insertSelective(record);
    }

    public Requisition_detailed selectByPrimaryKey(String rdId){
    	return dao.selectByPrimaryKey(rdId);
    }

    public int updateByPrimaryKeySelective(Requisition_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Requisition_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}