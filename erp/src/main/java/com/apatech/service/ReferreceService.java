package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Referrece;
import com.apatech.domain.Referrece;
import com.apatech.domain.Referrece;
import com.apatech.mapper.ReferreceMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ReferreceService {
	@Autowired
	private ReferreceMapper dao;
	
	public PageInfo<Referrece> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Referrece> list=dao.selectAll();

    	PageInfo<Referrece> page=new PageInfo<Referrece>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String referreceId){
    	return dao.deleteByPrimaryKey(referreceId);
    }

    public int insert(Referrece record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Referrece record){
    	return dao.insertSelective(record);
    }

    public Referrece selectByPrimaryKey(String referreceId){
    	return dao.selectByPrimaryKey(referreceId);
    }

    public int updateByPrimaryKeySelective(Referrece record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Referrece record){
    	return dao.updateByPrimaryKey(record);
    }
}