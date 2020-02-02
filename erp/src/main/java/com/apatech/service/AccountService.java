package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Account;
import com.apatech.mapper.AccountMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional
public class AccountService {
	@Autowired
	private AccountMapper dao;
	
	 public PageInfo<Account> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Account> list=dao.selectAll();

    	PageInfo<Account> page=new PageInfo<Account>(list);
//	    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
	
    public int deleteByPrimaryKey(String apId){
    	return dao.deleteByPrimaryKey(apId);    }

    public int insert(Account record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Account record){
    	return dao.insertSelective(record);
    }

    public Account selectByPrimaryKey(String apId){
    	return dao.selectByPrimaryKey(apId);
    }

    public int updateByPrimaryKeySelective(Account record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Account record){
    	return dao.updateByPrimaryKey(record);
    }
}