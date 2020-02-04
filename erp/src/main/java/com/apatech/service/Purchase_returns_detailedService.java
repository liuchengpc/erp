package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_returns_detailed;
import com.apatech.domain.Purchase_returns_detailed;
import com.apatech.domain.Purchase_returns_detailed;
import com.apatech.mapper.Purchase_returns_detailedMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Purchase_returns_detailedService {
	@Autowired
	private Purchase_returns_detailedMapper dao;
	
	public PageInfo<Purchase_returns_detailed> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Purchase_returns_detailed> list=dao.selectAll();

    	PageInfo<Purchase_returns_detailed> page=new PageInfo<Purchase_returns_detailed>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String puredId){
    	return dao.deleteByPrimaryKey(puredId);
    }

    public int insert(Purchase_returns_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_returns_detailed record){
    	return dao.insertSelective(record);
    }

    public Purchase_returns_detailed selectByPrimaryKey(String puredId){
    	return dao.selectByPrimaryKey(puredId);
    }

    public int updateByPrimaryKeySelective(Purchase_returns_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_returns_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}