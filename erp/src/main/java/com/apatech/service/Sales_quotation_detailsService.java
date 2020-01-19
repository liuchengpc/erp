package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_quotation_details;
import com.apatech.domain.Sales_quotation_details;
import com.apatech.mapper.Sales_quotation_detailsMapper;

@Service
@Transactional
public class Sales_quotation_detailsService {
	@Autowired
	private Sales_quotation_detailsMapper dao;
	
    public int deleteByPrimaryKey(String sqdId){
    	return dao.deleteByPrimaryKey(sqdId);
    }

    public int insert(Sales_quotation_details record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_quotation_details record){
    	return dao.insertSelective(record);
    }

    public Sales_quotation_details selectByPrimaryKey(String sqdId){
    	return dao.selectByPrimaryKey(sqdId);
    }

    public int updateByPrimaryKeySelective(Sales_quotation_details record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_quotation_details record){
    	return dao.updateByPrimaryKey(record);
    }
}