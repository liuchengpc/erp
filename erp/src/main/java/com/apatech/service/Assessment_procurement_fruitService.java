package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Assessment_procurement_fruit;
import com.apatech.domain.Assessment_procurement_fruit;
import com.apatech.mapper.Assessment_procurement_fruitMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Assessment_procurement_fruitService {
	@Autowired
	private Assessment_procurement_fruitMapper dao;
	
	 public PageInfo<Assessment_procurement_fruit> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Assessment_procurement_fruit> list=dao.selectAll();

    	PageInfo<Assessment_procurement_fruit> page=new PageInfo<Assessment_procurement_fruit>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String apfId){
    	return dao.deleteByPrimaryKey(apfId);
    }

    public int insert(Assessment_procurement_fruit record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Assessment_procurement_fruit record){
    	return dao.insertSelective(record);
    }

    public Assessment_procurement_fruit selectByPrimaryKey(String apfId){
    	return dao.selectByPrimaryKey(apfId);
    }

    public int updateByPrimaryKeySelective(Assessment_procurement_fruit record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Assessment_procurement_fruit record){
    	return dao.updateByPrimaryKey(record);
    }
}