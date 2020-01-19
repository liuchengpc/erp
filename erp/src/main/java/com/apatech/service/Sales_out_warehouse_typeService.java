package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_out_warehouse_type;
import com.apatech.domain.Sales_out_warehouse_type;
import com.apatech.mapper.Sales_out_warehouse_typeMapper;

@Service
@Transactional
public class Sales_out_warehouse_typeService {
	@Autowired
	private Sales_out_warehouse_typeMapper dao;
	
    public int deleteByPrimaryKey(String sowtId){
    	return dao.deleteByPrimaryKey(sowtId);
    }

    public int insert(Sales_out_warehouse_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_out_warehouse_type record){
    	return dao.insertSelective(record);
    }

    public Sales_out_warehouse_type selectByPrimaryKey(String sowtId){
    	return dao.selectByPrimaryKey(sowtId);
    }

    public int updateByPrimaryKeySelective(Sales_out_warehouse_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_out_warehouse_type record){
    	return dao.updateByPrimaryKey(record);
    }
}