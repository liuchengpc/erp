package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Warehouse_detail;
import com.apatech.domain.Warehouse_detail;
import com.apatech.mapper.Warehouse_detailMapper;

@Service
@Transactional
public class Warehouse_detailService {
	@Autowired
	private Warehouse_detailMapper dao;
	
    public int deleteByPrimaryKey(String wdId){
    	return dao.deleteByPrimaryKey(wdId);
    }

    public int insert(Warehouse_detail record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Warehouse_detail record){
    	return dao.insertSelective(record);
    }

    public Warehouse_detail selectByPrimaryKey(String wdId){
    	return dao.selectByPrimaryKey(wdId);
    }

    public int updateByPrimaryKeySelective(Warehouse_detail record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Warehouse_detail record){
    	return dao.updateByPrimaryKey(record);
    }
}