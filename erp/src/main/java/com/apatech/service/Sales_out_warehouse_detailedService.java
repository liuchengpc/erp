package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_out_warehouse_detailed;
import com.apatech.domain.Sales_out_warehouse_detailed;
import com.apatech.mapper.Sales_out_warehouse_detailedMapper;

@Service
@Transactional
public class Sales_out_warehouse_detailedService {
	@Autowired
	private Sales_out_warehouse_detailedMapper dao;
	
    public int deleteByPrimaryKey(String sowdId){
    	return dao.deleteByPrimaryKey(sowdId);
    }

    public int insert(Sales_out_warehouse_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_out_warehouse_detailed record){
    	return dao.insertSelective(record);
    }

    public Sales_out_warehouse_detailed selectByPrimaryKey(String sowdId){
    	return dao.selectByPrimaryKey(sowdId);
    }

    public int updateByPrimaryKeySelective(Sales_out_warehouse_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_out_warehouse_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}