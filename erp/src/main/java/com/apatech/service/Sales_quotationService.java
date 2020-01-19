package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_quotation;
import com.apatech.domain.Sales_quotation;
import com.apatech.mapper.Sales_quotationMapper;

@Service
@Transactional
public class Sales_quotationService {
	@Autowired
	private Sales_quotationMapper dao;
	
    public int deleteByPrimaryKey(String sqId){
    	return dao.deleteByPrimaryKey(sqId);
    }

    public int insert(Sales_quotation record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_quotation record){
    	return dao.insertSelective(record);
    }

    public Sales_quotation selectByPrimaryKey(String sqId){
    	return dao.selectByPrimaryKey(sqId);
    }

    public int updateByPrimaryKeySelective(Sales_quotation record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_quotation record){
    	return dao.updateByPrimaryKey(record);
    }
}