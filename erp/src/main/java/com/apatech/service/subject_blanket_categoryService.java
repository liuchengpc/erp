package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.subject_blanket_category;
import com.apatech.domain.subject_blanket_category;
import com.apatech.mapper.subject_blanket_categoryMapper;

@Service
@Transactional
public class subject_blanket_categoryService {
	@Autowired
	private subject_blanket_categoryMapper dao;
	
    public int deleteByPrimaryKey(String sbcId){
    	return dao.deleteByPrimaryKey(sbcId);
    }

    public int insert(subject_blanket_category record){
    	return dao.insert(record);
    }
    
    public int insertSelective(subject_blanket_category record){
    	return dao.insertSelective(record);
    }

    public subject_blanket_category selectByPrimaryKey(String sbcId){
    	return dao.selectByPrimaryKey(sbcId);
    }

    public int updateByPrimaryKeySelective(subject_blanket_category record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(subject_blanket_category record){
    	return dao.updateByPrimaryKey(record);
    }
}