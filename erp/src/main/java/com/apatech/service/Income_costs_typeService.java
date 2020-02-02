package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Income_costs_type;
import com.apatech.domain.Income_costs_type;
import com.apatech.domain.Income_costs_type;
import com.apatech.mapper.Income_costs_typeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Income_costs_typeService {
	@Autowired
	private Income_costs_typeMapper dao;
	
	public PageInfo<Income_costs_type> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Income_costs_type> list=dao.selectAll();

    	PageInfo<Income_costs_type> page=new PageInfo<Income_costs_type>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String ictId){
    	return dao.deleteByPrimaryKey(ictId);
    }

    public int insert(Income_costs_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Income_costs_type record){
    	return dao.insertSelective(record);
    }

    public Income_costs_type selectByPrimaryKey(String Income_costs_typeId){
    	return dao.selectByPrimaryKey(Income_costs_typeId);
    }

    public int updateByPrimaryKeySelective(Income_costs_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Income_costs_type record){
    	return dao.updateByPrimaryKey(record);
    }
}