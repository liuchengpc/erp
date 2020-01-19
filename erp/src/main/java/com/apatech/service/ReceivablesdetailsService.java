package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Receivablesdetails;
import com.apatech.domain.Receivablesdetails;
import com.apatech.mapper.ReceivablesdetailsMapper;

@Service
@Transactional
public class ReceivablesdetailsService {
	@Autowired
	private ReceivablesdetailsMapper dao;
	
    public int deleteByPrimaryKey(String recedetailId){
    	return dao.deleteByPrimaryKey(recedetailId);
    }

    public int insert(Receivablesdetails record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Receivablesdetails record){
    	return dao.insertSelective(record);
    }

    public Receivablesdetails selectByPrimaryKey(String recedetailId){
    	return dao.selectByPrimaryKey(recedetailId);
    }

    public int updateByPrimaryKeySelective(Receivablesdetails record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Receivablesdetails record){
    	return dao.updateByPrimaryKey(record);
    }
}