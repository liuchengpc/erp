package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Invoicetype;
import com.apatech.domain.Invoicetype;
import com.apatech.mapper.InvoicetypeMapper;

@Service
@Transactional
public class InvoicetypeService {
	@Autowired
	private InvoicetypeMapper dao;
	
    public int deleteByPrimaryKey(String invoicetypeId){
    	return dao.deleteByPrimaryKey(invoicetypeId);
    }

    public int insert(Invoicetype record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Invoicetype record){
    	return dao.insertSelective(record);
    }

    public Invoicetype selectByPrimaryKey(String invoicetypeId){
    	return dao.selectByPrimaryKey(invoicetypeId);
    }

    public int updateByPrimaryKeySelective(Invoicetype record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Invoicetype record){
    	return dao.updateByPrimaryKey(record);
    }
}