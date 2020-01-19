package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_discount;
import com.apatech.domain.Purchase_discount;
import com.apatech.mapper.Purchase_discountMapper;

@Service
@Transactional
public class Purchase_discountService {
	@Autowired
	private Purchase_discountMapper dao;
	
    public int deleteByPrimaryKey(String pdId){
    	return dao.deleteByPrimaryKey(pdId);
    }

    public int insert(Purchase_discount record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_discount record){
    	return dao.insertSelective(record);
    }

    public Purchase_discount selectByPrimaryKey(String pdId){
    	return dao.selectByPrimaryKey(pdId);
    }

    public int updateByPrimaryKeySelective(Purchase_discount record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_discount record){
    	return dao.updateByPrimaryKey(record);
    }
}