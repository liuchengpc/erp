package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_storage;
import com.apatech.domain.Purchase_storage;
import com.apatech.mapper.Purchase_storageMapper;

@Service
@Transactional
public class Purchase_storageService {
	@Autowired
	private Purchase_storageMapper dao;
	
    public int deleteByPrimaryKey(String psId){
    	return dao.deleteByPrimaryKey(psId);
    }

    public int insert(Purchase_storage record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_storage record){
    	return dao.insertSelective(record);
    }

    public Purchase_storage selectByPrimaryKey(String psId){
    	return dao.selectByPrimaryKey(psId);
    }

    public int updateByPrimaryKeySelective(Purchase_storage record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_storage record){
    	return dao.updateByPrimaryKey(record);
    }
}