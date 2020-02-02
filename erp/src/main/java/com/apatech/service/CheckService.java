package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Check;
import com.apatech.domain.Check;
import com.apatech.domain.Check;
import com.apatech.mapper.CheckMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CheckService {
	@Autowired
	private CheckMapper dao;
	
	public PageInfo<Check> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Check> list=dao.selectAll();

    	PageInfo<Check> page=new PageInfo<Check>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String checkId){
    	return dao.deleteByPrimaryKey(checkId);
    }

    public int insert(Check record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Check record){
    	return dao.insertSelective(record);
    }

    public Check selectByPrimaryKey(String checkId){
    	return dao.selectByPrimaryKey(checkId);
    }

    public int updateByPrimaryKeySelective(Check record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Check record){
    	return dao.updateByPrimaryKey(record);
    }
}