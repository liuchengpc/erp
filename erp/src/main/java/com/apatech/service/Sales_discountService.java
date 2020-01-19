package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_discount;
import com.apatech.domain.Sales_discount;
import com.apatech.mapper.Sales_discountMapper;

@Service
@Transactional
public class Sales_discountService {
	@Autowired
	private Sales_discountMapper dao;
	
    public int deleteByPrimaryKey(String sdId){
    	return dao.deleteByPrimaryKey(sdId);
    }

    public int insert(Sales_discount record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_discount record){
    	return dao.insertSelective(record);
    }

    public Sales_discount selectByPrimaryKey(String sdId){
    	return dao.selectByPrimaryKey(sdId);
    }

    public int updateByPrimaryKeySelective(Sales_discount record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_discount record){
    	return dao.updateByPrimaryKey(record);
    }
}