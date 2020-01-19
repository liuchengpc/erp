package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_discount_detailed;
import com.apatech.domain.Purchase_discount_detailed;
import com.apatech.mapper.Purchase_discount_detailedMapper;

@Service
@Transactional
public class Purchase_discount_detailedService {
	@Autowired
	private Purchase_discount_detailedMapper dao;
	
    public int deleteByPrimaryKey(String pddId){
    	return dao.deleteByPrimaryKey(pddId);
    }

    public int insert(Purchase_discount_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_discount_detailed record){
    	return dao.insertSelective(record);
    }

    public Purchase_discount_detailed selectByPrimaryKey(String pddId){
    	return dao.selectByPrimaryKey(pddId);
    }

    public int updateByPrimaryKeySelective(Purchase_discount_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_discount_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}