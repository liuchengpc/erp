package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Potential_customer;
import com.apatech.domain.Potential_customer;
import com.apatech.domain.Potential_customer;
import com.apatech.mapper.Potential_customerMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Potential_customerService {
	@Autowired
	private Potential_customerMapper dao;
	
	public PageInfo<Potential_customer> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Potential_customer> list=dao.selectAll();

    	PageInfo<Potential_customer> page=new PageInfo<Potential_customer>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String pcId){
    	return dao.deleteByPrimaryKey(pcId);
    }

    public int insert(Potential_customer record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Potential_customer record){
    	return dao.insertSelective(record);
    }

    public Potential_customer selectByPrimaryKey(String pcId){
    	return dao.selectByPrimaryKey(pcId);
    }

    public int updateByPrimaryKeySelective(Potential_customer record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Potential_customer record){
    	return dao.updateByPrimaryKey(record);
    }
}