package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Project;
import com.apatech.domain.Project;
import com.apatech.domain.Project;
import com.apatech.mapper.ProjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ProjectService {
	@Autowired
	private ProjectMapper dao;
	
	public PageInfo<Project> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Project> list=dao.selectAll();

    	PageInfo<Project> page=new PageInfo<Project>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
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

    public List<Project> selectAll() {
        return dao.selectAll();
    }
}