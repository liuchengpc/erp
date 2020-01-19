package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Collection_term;
import com.apatech.domain.Collection_term;
import com.apatech.mapper.Collection_termMapper;

@Service
@Transactional
public class Collection_termService {
	@Autowired
	private Collection_termMapper dao;
	
    public int deleteByPrimaryKey(String coteId){
    	return dao.deleteByPrimaryKey(coteId);
    }

    public int insert(Collection_term record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Collection_term record){
    	return dao.insertSelective(record);
    }

    public Collection_term selectByPrimaryKey(String coteId){
    	return dao.selectByPrimaryKey(coteId);
    }

    public int updateByPrimaryKeySelective(Collection_term record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Collection_term record){
    	return dao.updateByPrimaryKey(record);
    }
}