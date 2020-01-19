package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Subject_category;
import com.apatech.domain.Subject_category;
import com.apatech.mapper.Subject_categoryMapper;

@Service
@Transactional
public class Subject_categoryService {
	@Autowired
	private Subject_categoryMapper dao;
	
    public int deleteByPrimaryKey(String scId){
    	return dao.deleteByPrimaryKey(scId);
    }

    public int insert(Subject_category record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Subject_category record){
    	return dao.insertSelective(record);
    }

    public Subject_category selectByPrimaryKey(String scId){
    	return dao.selectByPrimaryKey(scId);
    }

    public int updateByPrimaryKeySelective(Subject_category record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Subject_category record){
    	return dao.updateByPrimaryKey(record);
    }
}