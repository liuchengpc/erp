package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Staff;
import com.apatech.domain.Staff;
import com.apatech.mapper.StaffMapper;

@Service
@Transactional
public class StaffService {
	@Autowired
	private StaffMapper dao;
	
    public int deleteByPrimaryKey(String staffId){
    	return dao.deleteByPrimaryKey(staffId);
    }

    public int insert(Staff record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Staff record){
    	return dao.insertSelective(record);
    }

    public Staff selectByPrimaryKey(String staffId){
    	return dao.selectByPrimaryKey(staffId);
    }

    public int updateByPrimaryKeySelective(Staff record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Staff record){
    	return dao.updateByPrimaryKey(record);
    }
}