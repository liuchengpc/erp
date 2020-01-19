package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Updown_program;
import com.apatech.domain.Updown_program;
import com.apatech.mapper.Updown_programMapper;

@Service
@Transactional
public class Updown_programService {
	@Autowired
	private Updown_programMapper dao;
	
    public int deleteByPrimaryKey(String upId){
    	return dao.deleteByPrimaryKey(upId);
    }

    public int insert(Updown_program record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Updown_program record){
    	return dao.insertSelective(record);
    }

    public Updown_program selectByPrimaryKey(String upId){
    	return dao.selectByPrimaryKey(upId);
    }

    public int updateByPrimaryKeySelective(Updown_program record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Updown_program record){
    	return dao.updateByPrimaryKey(record);
    }
}