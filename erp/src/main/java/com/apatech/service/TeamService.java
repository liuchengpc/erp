package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Team;
import com.apatech.mapper.TeamMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class TeamService {
	@Autowired
	private TeamMapper dao;
	
	 public PageInfo<Team> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Team> list=dao.selectAll();

    	PageInfo<Team> page=new PageInfo<Team>(list);
//    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String teamId){
    	return dao.deleteByPrimaryKey(teamId);
    }

    public int insert(Team record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Team record){
    	return dao.insertSelective(record);
    }

    public Team selectByPrimaryKey(String TeamId){
    	return dao.selectByPrimaryKey(TeamId);
    }

    public int updateByPrimaryKeySelective(Team record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Team record){
    	return dao.updateByPrimaryKey(record);
    }
}