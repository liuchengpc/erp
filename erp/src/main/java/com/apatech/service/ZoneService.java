package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Zone;
import com.apatech.domain.Zone;
import com.apatech.domain.Zone;
import com.apatech.mapper.ZoneMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ZoneService {
	@Autowired
	private ZoneMapper dao;
	
	public PageInfo<Zone> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Zone> list=dao.selectAll();

    	PageInfo<Zone> page=new PageInfo<Zone>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
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