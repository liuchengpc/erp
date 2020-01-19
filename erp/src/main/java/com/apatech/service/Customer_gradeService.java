package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Customer_grade;
import com.apatech.domain.Customer_grade;
import com.apatech.mapper.Customer_gradeMapper;

@Service
@Transactional
public class Customer_gradeService {
	@Autowired
	private Customer_gradeMapper dao;
	
    public int deleteByPrimaryKey(String cgId){
    	return dao.deleteByPrimaryKey(cgId);
    }

    public int insert(Customer_grade record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Customer_grade record){
    	return dao.insertSelective(record);
    }

    public Customer_grade selectByPrimaryKey(String cgId){
    	return dao.selectByPrimaryKey(cgId);
    }

    public int updateByPrimaryKeySelective(Customer_grade record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Customer_grade record){
    	return dao.updateByPrimaryKey(record);
    }
}