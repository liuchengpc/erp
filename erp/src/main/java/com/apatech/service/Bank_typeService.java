package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Bank_type;
import com.apatech.domain.Bank_type;
import com.apatech.domain.Bank_type;
import com.apatech.mapper.Bank_typeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Bank_typeService {
	@Autowired
	private Bank_typeMapper dao;
	
	public PageInfo<Bank_type> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Bank_type> list=dao.selectAll();

    	PageInfo<Bank_type> page=new PageInfo<Bank_type>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String btId){
    	return dao.deleteByPrimaryKey(btId);
    }

    public int insert(Bank_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Bank_type record){
    	return dao.insertSelective(record);
    }

    public Bank_type selectByPrimaryKey(String btId){
    	return dao.selectByPrimaryKey(btId);
    }

    public int updateByPrimaryKeySelective(Bank_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Bank_type record){
    	return dao.updateByPrimaryKey(record);
    }
}