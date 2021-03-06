package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchasing_order_detailed;
import com.apatech.mapper.Purchasing_order_detailedMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Purchasing_order_detailedService {
    @Autowired
	private Purchasing_order_detailedMapper dao;
	
	public PageInfo<Purchasing_order_detailed> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Purchasing_order_detailed> list=dao.selectAll();

    	PageInfo<Purchasing_order_detailed> page=new PageInfo<Purchasing_order_detailed>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String potId){
    	return dao.deleteByPrimaryKey(potId);
    }

    public int insert(Purchasing_order_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchasing_order_detailed record){
    	return dao.insertSelective(record);
    }

    public Purchasing_order_detailed selectByPrimaryKey(String potId){
    	return dao.selectByPrimaryKey(potId);
    }

    public int updateByPrimaryKeySelective(Purchasing_order_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchasing_order_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}