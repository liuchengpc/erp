package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Project;
import com.apatech.domain.Project;
import com.apatech.mapper.ProjectMapper;

@Service
@Transactional
public class ProjectService {
	@Autowired
	private ProjectMapper dao;
	
    public int deleteByPrimaryKey(String projectId){
    	return dao.deleteByPrimaryKey(projectId);
    }

    public int insert(Project record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Project record){
    	return dao.insertSelective(record);
    }

    public Project selectByPrimaryKey(String projectId){
    	return dao.selectByPrimaryKey(projectId);
    }

    public int updateByPrimaryKeySelective(Project record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Project record){
    	return dao.updateByPrimaryKey(record);
    }
}