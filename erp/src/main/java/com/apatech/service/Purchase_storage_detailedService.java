package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_storage_detailed;
import com.apatech.domain.Purchase_storage_detailed;
import com.apatech.mapper.Purchase_storage_detailedMapper;

@Service
@Transactional
public class Purchase_storage_detailedService {
	@Autowired
	private Purchase_storage_detailedMapper dao;
	
    public int deleteByPrimaryKey(String psdId){
    	return dao.deleteByPrimaryKey(psdId);
    }

    public int insert(Purchase_storage_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_storage_detailed record){
    	return dao.insertSelective(record);
    }

    public Purchase_storage_detailed selectByPrimaryKey(String psdId){
    	return dao.selectByPrimaryKey(psdId);
    }

    public int updateByPrimaryKeySelective(Purchase_storage_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_storage_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}