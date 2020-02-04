package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Measurement_unit;
import com.apatech.domain.Measurement_unit;
import com.apatech.domain.Measurement_unit;
import com.apatech.mapper.Measurement_unitMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Measurement_unitService {
	@Autowired
	private Measurement_unitMapper dao;
	
	public PageInfo<Measurement_unit> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Measurement_unit> list=dao.selectAll();

    	PageInfo<Measurement_unit> page=new PageInfo<Measurement_unit>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String muId){
    	return dao.deleteByPrimaryKey(muId);
    }

    public int insert(Measurement_unit record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Measurement_unit record){
    	return dao.insertSelective(record);
    }

    public Measurement_unit selectByPrimaryKey(String muId){
    	return dao.selectByPrimaryKey(muId);
    }

    public int updateByPrimaryKeySelective(Measurement_unit record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Measurement_unit record){
    	return dao.updateByPrimaryKey(record);
    }
}