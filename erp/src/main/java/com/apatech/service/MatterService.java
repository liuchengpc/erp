package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Matter;
import com.apatech.domain.Matter;
import com.apatech.mapper.MatterMapper;

@Service
@Transactional
public class MatterService {
	@Autowired
	private MatterMapper dao;
	
    public int deleteByPrimaryKey(String matterId){
    	return dao.deleteByPrimaryKey(matterId);
    }

    public int insert(Matter record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Matter record){
    	return dao.insertSelective(record);
    }

    public Matter selectByPrimaryKey(String matterId){
    	return dao.selectByPrimaryKey(matterId);
    }

    public int updateByPrimaryKeySelective(Matter record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Matter record){
    	return dao.updateByPrimaryKey(record);
    }
}