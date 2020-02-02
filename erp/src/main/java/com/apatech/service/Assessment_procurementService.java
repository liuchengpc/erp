package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Assessment_procurement;
import com.apatech.domain.Assessment_procurement;
import com.apatech.mapper.Assessment_procurementMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Assessment_procurementService {
	@Autowired
	private Assessment_procurementMapper dao;
	
	public PageInfo<Assessment_procurement> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Assessment_procurement> list=dao.selectAll();

    	PageInfo<Assessment_procurement> page=new PageInfo<Assessment_procurement>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String apId){
    	return dao.deleteByPrimaryKey(apId);
    }

    public int insert(Assessment_procurement record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Assessment_procurement record){
    	return dao.insertSelective(record);
    }

    public Assessment_procurement selectByPrimaryKey(String apId){
    	return dao.selectByPrimaryKey(apId);
    }

    public int updateByPrimaryKeySelective(Assessment_procurement record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Assessment_procurement record){
    	return dao.updateByPrimaryKey(record);
    }
}