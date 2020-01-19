package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Priadetails;
import com.apatech.domain.Priadetails;
import com.apatech.mapper.PriadetailsMapper;

@Service
@Transactional
public class PriadetailsService {
	@Autowired
	private PriadetailsMapper dao;
	
    public int deleteByPrimaryKey(String priadetailsId){
    	return dao.deleteByPrimaryKey(priadetailsId);
    }

    public int insert(Priadetails record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Priadetails record){
    	return dao.insertSelective(record);
    }

    public Priadetails selectByPrimaryKey(String priadetailsId){
    	return dao.selectByPrimaryKey(priadetailsId);
    }

    public int updateByPrimaryKeySelective(Priadetails record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Priadetails record){
    	return dao.updateByPrimaryKey(record);
    }
}