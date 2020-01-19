package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Material_type;
import com.apatech.domain.Material_type;
import com.apatech.mapper.Material_typeMapper;

@Service
@Transactional
public class Material_typeService {
	@Autowired
	private Material_typeMapper dao;
	
    public int deleteByPrimaryKey(String mtId){
    	return dao.deleteByPrimaryKey(mtId);
    }

    public int insert(Material_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Material_type record){
    	return dao.insertSelective(record);
    }

    public Material_type selectByPrimaryKey(String mtId){
    	return dao.selectByPrimaryKey(mtId);
    }

    public int updateByPrimaryKeySelective(Material_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Material_type record){
    	return dao.updateByPrimaryKey(record);
    }
}