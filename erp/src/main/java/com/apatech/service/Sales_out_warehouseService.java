package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_out_warehouse;
import com.apatech.domain.Sales_out_warehouse;
import com.apatech.mapper.Sales_out_warehouseMapper;

@Service
@Transactional
public class Sales_out_warehouseService {
	@Autowired
	private Sales_out_warehouseMapper dao;
	
    public int deleteByPrimaryKey(String sowId){
    	return dao.deleteByPrimaryKey(sowId);
    }

    public int insert(Sales_out_warehouse record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_out_warehouse record){
    	return dao.insertSelective(record);
    }

    public Sales_out_warehouse selectByPrimaryKey(String sowId){
    	return dao.selectByPrimaryKey(sowId);
    }

    public int updateByPrimaryKeySelective(Sales_out_warehouse record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_out_warehouse record){
    	return dao.updateByPrimaryKey(record);
    }
}