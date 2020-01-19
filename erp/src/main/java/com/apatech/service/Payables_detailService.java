package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Payables_detail;
import com.apatech.domain.Payables_detail;
import com.apatech.mapper.Payables_detailMapper;

@Service
@Transactional
public class Payables_detailService {
	@Autowired
	private Payables_detailMapper dao;
	
    public int deleteByPrimaryKey(String paydetailId){
    	return dao.deleteByPrimaryKey(paydetailId);
    }

    public int insert(Payables_detail record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Payables_detail record){
    	return dao.insertSelective(record);
    }

    public Payables_detail selectByPrimaryKey(String paydetailId){
    	return dao.selectByPrimaryKey(paydetailId);
    }

    public int updateByPrimaryKeySelective(Payables_detail record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Payables_detail record){
    	return dao.updateByPrimaryKey(record);
    }
}