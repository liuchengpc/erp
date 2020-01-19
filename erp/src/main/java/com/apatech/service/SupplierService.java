package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Supplier;
import com.apatech.domain.Supplier;
import com.apatech.mapper.SupplierMapper;

@Service
@Transactional
public class SupplierService {
	@Autowired
	private SupplierMapper dao;
	
    public int deleteByPrimaryKey(String supplierId){
    	return dao.deleteByPrimaryKey(supplierId);
    }

    public int insert(Supplier record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Supplier record){
    	return dao.insertSelective(record);
    }

    public Supplier selectByPrimaryKey(String supplierId){
    	return dao.selectByPrimaryKey(supplierId);
    }

    public int updateByPrimaryKeySelective(Supplier record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Supplier record){
    	return dao.updateByPrimaryKey(record);
    }
}