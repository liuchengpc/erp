package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_return_warehouse;
import com.apatech.domain.Sales_return_warehouse;
import com.apatech.mapper.Sales_return_warehouseMapper;

@Service
@Transactional
public class Sales_return_warehouseService {
	@Autowired
	private Sales_return_warehouseMapper dao;
	
    public int deleteByPrimaryKey(String srwId){
    	return dao.deleteByPrimaryKey(srwId);
    }

    public int insert(Sales_return_warehouse record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_return_warehouse record){
    	return dao.insertSelective(record);
    }

    public Sales_return_warehouse selectByPrimaryKey(String srwId){
    	return dao.selectByPrimaryKey(srwId);
    }

    public int updateByPrimaryKeySelective(Sales_return_warehouse record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_return_warehouse record){
    	return dao.updateByPrimaryKey(record);
    }
}