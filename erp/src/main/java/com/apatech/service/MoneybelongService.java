package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Moneybelong;
import com.apatech.domain.Moneybelong;
import com.apatech.domain.Moneybelong;
import com.apatech.mapper.MoneybelongMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class MoneybelongService {
	@Autowired
	private MoneybelongMapper dao;
	
	public PageInfo<Moneybelong> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Moneybelong> list=dao.selectAll();

    	PageInfo<Moneybelong> page=new PageInfo<Moneybelong>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String moneybelongId){
    	return dao.deleteByPrimaryKey(moneybelongId);
    }

    public int insert(Moneybelong record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Moneybelong record){
    	return dao.insertSelective(record);
    }

    public Moneybelong selectByPrimaryKey(String moneybelongId){
    	return dao.selectByPrimaryKey(moneybelongId);
    }

    public int updateByPrimaryKeySelective(Moneybelong record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Moneybelong record){
    	return dao.updateByPrimaryKey(record);
    }
}