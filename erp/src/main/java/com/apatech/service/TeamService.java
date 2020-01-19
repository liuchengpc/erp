package com.apatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Team;
import com.apatech.domain.Team;
import com.apatech.mapper.TeamMapper;

@Service
@Transactional
public class TeamService {
	@Autowired
	private TeamMapper dao;
	
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