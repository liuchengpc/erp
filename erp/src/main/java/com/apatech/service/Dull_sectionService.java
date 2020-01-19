package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Dull_section;
import com.apatech.domain.Dull_section;
import com.apatech.mapper.Dull_sectionMapper;

@Service
@Transactional
public class Dull_sectionService {
	@Autowired
	private Dull_sectionMapper dao;
	
    public int deleteByPrimaryKey(String dsId){
    	return dao.deleteByPrimaryKey(dsId);
    }

    public int insert(Dull_section record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Dull_section record){
    	return dao.insertSelective(record);
    }

    public Dull_section selectByPrimaryKey(String dsId){
    	return dao.selectByPrimaryKey(dsId);
    }

    public int updateByPrimaryKeySelective(Dull_section record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Dull_section record){
    	return dao.updateByPrimaryKey(record);
    }
}