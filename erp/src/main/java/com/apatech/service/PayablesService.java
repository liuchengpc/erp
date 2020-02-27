package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Payables;
import com.apatech.domain.Payables;
import com.apatech.domain.Payables;
import com.apatech.mapper.PayablesMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class PayablesService {
	@Autowired
	private PayablesMapper dao;
	
	public PageInfo<Payables> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Payables> list=dao.selectAll();

    	PageInfo<Payables> page=new PageInfo<Payables>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String payablesId){
    	return dao.deleteByPrimaryKey(payablesId);
    }

    public int insert(Payables record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Payables record){
    	return dao.insertSelective(record);
    }

    public Payables selectByPrimaryKey(String payablesId){
    	return dao.selectByPrimaryKey(payablesId);
    }

    public int updateByPrimaryKeySelective(Payables record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Payables record){
    	return dao.updateByPrimaryKey(record);
    }
}