package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Casha_ccount;
import com.apatech.domain.Casha_ccount;
import com.apatech.mapper.Casha_ccountMapper;

@Service
@Transactional
public class Casha_ccountService {
	@Autowired
	private Casha_ccountMapper dao;
	
    public int deleteByPrimaryKey(String ccId){
    	return dao.deleteByPrimaryKey(ccId);
    }

    public int insert(Casha_ccount record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Casha_ccount record){
    	return dao.insertSelective(record);
    }

    public Casha_ccount selectByPrimaryKey(String ccId){
    	return dao.selectByPrimaryKey(ccId);
    }

    public int updateByPrimaryKeySelective(Casha_ccount record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Casha_ccount record){
    	return dao.updateByPrimaryKey(record);
    }
}