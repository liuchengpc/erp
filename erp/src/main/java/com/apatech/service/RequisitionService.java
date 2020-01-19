package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Requisition;
import com.apatech.domain.Requisition;
import com.apatech.mapper.RequisitionMapper;

@Service
@Transactional
public class RequisitionService {
	@Autowired
	private RequisitionMapper dao;
	
    public int deleteByPrimaryKey(String requisitionId){
    	return dao.deleteByPrimaryKey(requisitionId);
    }

    public int insert(Requisition record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Requisition record){
    	return dao.insertSelective(record);
    }

    public Requisition selectByPrimaryKey(String requisitionId){
    	return dao.selectByPrimaryKey(requisitionId);
    }

    public int updateByPrimaryKeySelective(Requisition record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Requisition record){
    	return dao.updateByPrimaryKey(record);
    }
}