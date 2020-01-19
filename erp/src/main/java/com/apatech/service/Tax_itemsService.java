package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Tax_items;
import com.apatech.domain.Tax_items;
import com.apatech.mapper.Tax_itemsMapper;

@Service
@Transactional
public class Tax_itemsService {
	@Autowired
	private Tax_itemsMapper dao;
	
    public int deleteByPrimaryKey(String tiId){
    	return dao.deleteByPrimaryKey(tiId);
    }

    public int insert(Tax_items record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Tax_items record){
    	return dao.insertSelective(record);
    }

    public Tax_items selectByPrimaryKey(String tiId){
    	return dao.selectByPrimaryKey(tiId);
    }

    public int updateByPrimaryKeySelective(Tax_items record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Tax_items record){
    	return dao.updateByPrimaryKey(record);
    }
}