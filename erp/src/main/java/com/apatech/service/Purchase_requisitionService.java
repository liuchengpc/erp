package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_requisition;
import com.apatech.domain.Purchase_requisition;
import com.apatech.mapper.Purchase_requisitionMapper;

@Service
@Transactional
public class Purchase_requisitionService {
	@Autowired
	private Purchase_requisitionMapper dao;
	
    public int deleteByPrimaryKey(String prId){
    	return dao.deleteByPrimaryKey(prId);
    }

    public int insert(Purchase_requisition record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_requisition record){
    	return dao.insertSelective(record);
    }

    public Purchase_requisition selectByPrimaryKey(String prId){
    	return dao.selectByPrimaryKey(prId);
    }

    public int updateByPrimaryKeySelective(Purchase_requisition record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_requisition record){
    	return dao.updateByPrimaryKey(record);
    }
}