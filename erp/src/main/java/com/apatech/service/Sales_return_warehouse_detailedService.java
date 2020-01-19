package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_return_warehouse_detailed;
import com.apatech.domain.Sales_return_warehouse_detailed;
import com.apatech.mapper.Sales_return_warehouse_detailedMapper;

@Service
@Transactional
public class Sales_return_warehouse_detailedService {
	@Autowired
	private Sales_return_warehouse_detailedMapper dao;
	
    public int deleteByPrimaryKey(String srwdId){
    	return dao.deleteByPrimaryKey(srwdId);
    }

    public int insert(Sales_return_warehouse_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_return_warehouse_detailed record){
    	return dao.insertSelective(record);
    }

    public Sales_return_warehouse_detailed selectByPrimaryKey(String srwdId){
    	return dao.selectByPrimaryKey(srwdId);
    }

    public int updateByPrimaryKeySelective(Sales_return_warehouse_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_return_warehouse_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}