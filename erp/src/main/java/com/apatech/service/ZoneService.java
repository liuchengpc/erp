package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Zone;
import com.apatech.domain.Zone;
import com.apatech.mapper.ZoneMapper;

@Service
@Transactional
public class ZoneService {
	@Autowired
	private ZoneMapper dao;
	
    public int deleteByPrimaryKey(String zoneId){
    	return dao.deleteByPrimaryKey(zoneId);
    }

    public int insert(Zone record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Zone record){
    	return dao.insertSelective(record);
    }

    public Zone selectByPrimaryKey(String zoneId){
    	return dao.selectByPrimaryKey(zoneId);
    }

    public int updateByPrimaryKeySelective(Zone record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Zone record){
    	return dao.updateByPrimaryKey(record);
    }
}