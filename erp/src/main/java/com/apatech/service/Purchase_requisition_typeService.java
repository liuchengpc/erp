package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_requisition_type;
import com.apatech.domain.Purchase_requisition_type;
import com.apatech.mapper.Purchase_requisition_typeMapper;

@Service
@Transactional
public class Purchase_requisition_typeService {
	@Autowired
	private Purchase_requisition_typeMapper dao;
	
    public int deleteByPrimaryKey(String prtId){
    	return dao.deleteByPrimaryKey(prtId);
    }

    public int insert(Purchase_requisition_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_requisition_type record){
    	return dao.insertSelective(record);
    }

    public Purchase_requisition_type selectByPrimaryKey(String prtId){
    	return dao.selectByPrimaryKey(prtId);
    }

    public int updateByPrimaryKeySelective(Purchase_requisition_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_requisition_type record){
    	return dao.updateByPrimaryKey(record);
    }
}