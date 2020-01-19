package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Warehouse;
import com.apatech.domain.Warehouse;
import com.apatech.mapper.WarehouseMapper;

@Service
@Transactional
public class WarehouseService {
	@Autowired
	private WarehouseMapper dao;
	
    public int deleteByPrimaryKey(String warehouseId){
    	return dao.deleteByPrimaryKey(warehouseId);
    }

    public int insert(Warehouse record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Warehouse record){
    	return dao.insertSelective(record);
    }

    public Warehouse selectByPrimaryKey(String warehouseId){
    	return dao.selectByPrimaryKey(warehouseId);
    }

    public int updateByPrimaryKeySelective(Warehouse record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Warehouse record){
    	return dao.updateByPrimaryKey(record);
    }
}