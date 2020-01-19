package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_requisition_detailed;
import com.apatech.domain.Purchase_requisition_detailed;
import com.apatech.mapper.Purchase_requisition_detailedMapper;

@Service
@Transactional
public class Purchase_requisition_detailedService {
	@Autowired
	private Purchase_requisition_detailedMapper dao;
	
    public int deleteByPrimaryKey(String prdId){
    	return dao.deleteByPrimaryKey(prdId);
    }

    public int insert(Purchase_requisition_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_requisition_detailed record){
    	return dao.insertSelective(record);
    }

    public Purchase_requisition_detailed selectByPrimaryKey(String prdId){
    	return dao.selectByPrimaryKey(prdId);
    }

    public int updateByPrimaryKeySelective(Purchase_requisition_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_requisition_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}